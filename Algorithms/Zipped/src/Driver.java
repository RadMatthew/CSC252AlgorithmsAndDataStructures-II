import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "heeeelooaaaaymndddccxiii           wwwr";
		String str2 = "hello world";
		byte[] strBa = str1.getBytes();
		byte[] ba = new byte[] { -45, 56, 67, 78, 89, 12, 23, 34, 45, 23, 45, 67, 45 };
		byte[] testStr = str2.getBytes();
		byte[] testInt = new byte[] {-45, 45, 67, 67, 23};
//		ht.printNodes();
		
//		Path path = Paths.get("compressed.huff");
//		byte[] data = new byte[0];
//		try {
//			data = Files.readAllBytes(path);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i< data.length; i++) {
//			data[i] = data[i];
//			System.out.print(data[i] >> 2);
//		}
		
		
//-----------------------testInt-----------------------------------------------		
		HuffmanTree ht = new HuffmanTree(ba);
		
		HuffmanCompressor hc = new HuffmanCompressor();
		byte[] compressed = hc.compress(ht, testInt);
		
		for(int i = 0; i < compressed.length; i++)
			System.out.print(compressed[i] + " ");
		
		System.out.println();
		byte[] decompressed = hc.decompress(ht, testInt.length, compressed);
		for(int i = 0; i < decompressed.length; i++)
			System.out.print(decompressed[i] + " ");
		
		
//-----------------------testStr-----------------------------------------------		
//		HuffmanTree ht = new HuffmanTree(strBa);
//		HuffmanCompressor hc = new HuffmanCompressor();
//		byte[] compressed = hc.compress(ht, testStr);
//		
//		for(int i = 0; i < compressed.length; i++)
//			System.out.print(compressed[i] + " ");
//		
//		System.out.println();
//		byte[] decompressed = hc.decompress(ht, testStr.length, compressed);
//		for(int i = 0; i < decompressed.length; i++)
//			System.out.print(decompressed[i] + " ");
//		
//		System.out.println();
//		char[] ascii = hc.convertAscii(decompressed);
//		for(int i = 0; i < ascii.length; i++)
//			System.out.print(ascii[i]);
	}

}
