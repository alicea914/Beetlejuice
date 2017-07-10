
/**
 * Write a description of class WavFileLister here.
 * 
 * @author Al Licea Jr
 * @version 0.01
 */
import java.io.File;

public class WavFileLister
{
    private String srcDir = "";     //Source Directory
    private String output = "";     //Output Text

    /*
     * 
     */
    public WavFileLister(String sd) {
        File srcFile = new File(sd);

        if(sd.length() > 3 && srcFile.isDirectory()) {
            srcDir = sd;
            output = "Listing Sound Wave Files in " + sd + "\n";
        }
        else {
            printBadSrcDir(sd.length());
        }    
    }

    public String output() {
        return output; 
    }

    /*
     * 
     */
    private void printBadSrcDir(int l) {
        System.out.println("Error: Bad Src Dir Input. Invalid Length: " + l + 
            "\n(Char count must be greater than 3)");
    }

    /*
     * 
     */
    private void printBadSrcDir(String p) {
        System.out.println("Error: Bad Src Dir Input. Invalid Path: " + p + 
            "\n(Path must be valid [i.e. C:/Pizza])");
    }

    /*
     * 
     */
    public void listFiles() {
        System.out.println("\nmethod listFiles\n");

        String currPath = srcDir;

        System.out.println(currPath);

        File currFile = new File(currPath);
        String[] currFileList = null;

        if (!currFile.isDirectory()) {
            output += currFile.getName();
        } else {
            output = listFilesRec(currPath, 0, output);
        }
    }

    /*
     * 
     */
    private String listFilesRec(String path, int tabs, String out) {
        File cF = new File(path);
        String[] fL = cF.list();
		String tmpOut = out;

        //System.out.println("pre-list-loop");
        for (int i = 0; i < fL.length; ++i) {
            File tmp = new File(path + fL[i]);

            //if(fL[i].endsWith("*wav")) {
            tmpOut += (tabHelper(tabs) + fL[i] + "\n");
            //}
            System.out.println(tmp.isDirectory());
            if(!tmp.getName().contains(".")) {
                //System.out.println("output assignation");
                tmpOut += listFilesRec((path + "\\" + fL[i]), (tabs + 1), tmpOut);
            }
        }
		output = tmpOut;
        return output;
    }

    /*
     * 
     */
    private String tabHelper(int numTbs) {
        if (numTbs == 0) return "";
        else if (numTbs < 0) {
            System.out.println("Can't have negative tabs, ey"); return "";
        } else {
            String retVal = "";
            for(int i = 0; i < numTbs; ++i) {
                retVal += "\t";
            }
            return retVal;
        }
    }

    /*
     * 
     */
    public String toString() {
        return "Source Directory: " + srcDir + "\n" + output;
    }

}
