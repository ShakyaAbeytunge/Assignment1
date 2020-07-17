object Assignment4 extends App {

  import scala.io.StdIn.readLine
  import scala.io.StdIn.readInt

  val encrypt=(c: Char, s: Int)=> if(c.isLower) (97+(c-97+s)%26).toChar
    else (65+(c-65+s)%26).toChar

  val decrypt=(c: Char, s: Int)=> if(c.isLower) (122-(122-c+s)%26).toChar
    else (90-(90-c+s)%26).toChar

  val cipher=(f:(Char,Int)=>Char,t:String,s: Int)=>t.map(f(_,s))

    var text: String = readLine("Enter a text to encrypt : ");
    print("Enter shift : "); //Executes right shift
    var s: Int = readInt();
    print("Encrypted text : ");
    println(cipher(encrypt,text,s));

    text = readLine("Enter a text to decrypt : ");
    print("Decrypted text : ");
    println(cipher(decrypt,text,s));

}
