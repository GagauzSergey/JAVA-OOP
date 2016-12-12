package sequenceInput;

import java.io.*;
import java.io.SequenceInputStream;

/**
 * Created by user on 12.12.2016.
 */
public class MainSeq {
    public static void main(String[] args) throws IOException {
        String pathseq = "E:\\Testing Libs\\hwtest\\final_seq.txt";
        String path1 = "E:\\Testing Libs\\hwtest\\tAst.txt";
        String path2 = "E:\\Testing Libs\\hwtest\\stream2.txt";

        new File(pathseq).createNewFile();
        FileInputStream strm1 = new FileInputStream(path1);
        FileInputStream strm2 = new FileInputStream(path2);

        InputStream seq = new SequenceInputStream(strm1, strm2);
        FileOutputStream out = new FileOutputStream(pathseq);
        int data = seq.read();
        while (data != -1) {
            out.write(data);
            data = seq.read();
        }
        out.close();
    }
}