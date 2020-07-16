object Assignment4 extends App {

  import scala.io.StdIn.readLine
  import scala.io.StdIn.readInt

  def encrypt(c: Char, s: Int): Char={
    if(c.isLower) (97+(c-97+s)%26).toChar
    else (65+(c-65+s)%26).toChar
  }
  def decrypt(c: Char, s: Int): Char={
    if(c.isLower) (122-(122-c+s)%26).toChar
    else (90-(90-c+s)%26).toChar
  }
  def convert(f:(Char,Int)=>Char,text: String, s: Int):String={
    if(text.length==1) f(text(0),s)+"";
    else f(text(0),s)+convert(f,text.substring(1),s)
  }

    var text: String = readLine("Enter a text to encrypt : ");
    print("Enter shift : "); //Executes right shift
    var s: Int = readInt();
    print("Encrypted text : ");
    println(convert(encrypt,text,s));

    text = readLine("Enter a text to decrypt : ");
    print("Decrypted text : ");
    println(convert(decrypt,text,s));

}
