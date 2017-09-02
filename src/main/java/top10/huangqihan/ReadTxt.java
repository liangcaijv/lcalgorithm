/*package top10.huangqihan;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Random;

public class ReadTxt {
	public static void main(String[] arg) {
		Read r = new Read("D:/niotest/test1.txt");
		Thread rr = new Thread(r);
		rr.start();
	}

}

class Read implements Runnable{

	String road;
	Read(String road){
		this.road = road;
	}
	@Override
	public void run() {
		try(FileChannel channel = FileChannel.open(Paths.get("D:/niotest/test1.txt"), StandardOpenOption.READ);){
			//读取channel内容
			ByteBuffer buffer = ByteBuffer.allocate(2);//一次读取1mb
			int flag = channel.read(buffer);//read，没有内容返回-1.
			String tem = "ad";
			//StringBuffer temp;
			char first = 'A' ;
			char arr;
			HashMap<Integer,MyLinkedList> map = new HashMap<Integer,MyLinkedList>();
			MyLinkedList list = new MyLinkedList();
			for(int i =0;i<26;i++) {
				map.put(i, list);
			}
			while(flag!=-1) {
				//处理buffer
				buffer.flip();//切换写模式到读模式 limit =position then position = 0
//				CharBuffer charbuffer = buffer.asCharBuffer();
				Charset charset = Charset.forName("GBK");//声明编码格式
				CharBuffer charbuffer = charset.decode(buffer);//把bytebuffer编码变成字符
				arr=charbuffer.get();
					if(arr==' ') {
						
						list = map.get(first-97);
						if(list.search(tem).equals(null)) {
							MyLinkedList listl = new MyLinkedList();
							listl.add(tem);
							map.put(first-97, listl);
						}
						buffer.clear();
						flag = channel.read(buffer);
						first = (char) buffer.get();
						tem="";
					}else {
					tem+=arr;
					}
				buffer.clear();
				flag = channel.read(buffer);
		}
			System.out.println(map.get(1));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}*/