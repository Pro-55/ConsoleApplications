import Foundation

func main(){
  var options: String = "n"
  repeat {
    print()

    print("Enter No. of Lines: ",terminator: "")

   if let input = readLine() {
    if let rows = Int(input) {
      
      print()

      for i in 0...rows {
        for _ in 0..<rows - i {
          print(" ",terminator: "")   
        }
        for _ in 0...i {
          print("* ",terminator: "")    
        }
        for _ in i..<rows {
          print("  ", terminator: "")  
        }
        for _ in 0...i {
          print(" *",terminator: "")    
        }
        print()
      }
     
      for i in 0...rows {
        for _ in 0...i * 2 {
          print(" ", terminator: "")
        }
        for _ in i * 2...rows * 2 {
          print("* ", terminator: "")    
        }
        print()
      }

      print()

      repeat {
        print()

        print("Go Again?(Y/N): ",terminator: "")
        if let ln = readLine(){
          options = ln
          
          print()
          
          if askAgain(options: options) == 1{
            print("Y/N")
          }
        }
        
      } while askAgain(options: options) == 1

    }

   }

    print("_____________________________________________________")

  } while options.caseInsensitiveCompare("n") != .orderedSame

  print()
  
  print("Thank You!")
  
}

func askAgain(options: String) -> Int {
  if options.caseInsensitiveCompare("n") == .orderedSame || options.caseInsensitiveCompare("y") == .orderedSame {
    return 0 
  }
  return 1
}

main()
