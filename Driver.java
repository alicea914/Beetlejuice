
/**
 * Write a description of class Driver here.
 * 
 * @author Alvaro Licea Jr 
 * @version 3/22/17
 */
public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Init");

        String path1 = "C:\\Program Files (x86)\\Image-Line\\FL Studio 12\\Data\\Patches\\Packs\\Midi";
        String path2 = "C:\\Program Files (x86)\\Image-Line\\FL Studio 12\\Data\\Patches\\Packs\\808 Samples";
        String path3 = "C:\\Program Files (x86)\\Image-Line\\FL Studio 12\\Data\\Patches\\Packs\\Alien 808s n 909s";
        String path4 = "C:\\Program Files (x86)\\Image-Line\\FL Studio 12\\Data\\Patches\\Packs\\ModernBeats Free Kit";
        String path5 = "C:\\Program Files (x86)\\Image-Line\\FL Studio 12\\Data\\Patches\\Packs";

        //         System.out.println("Testing no Wavs");
        //         WavFileLister noWavs = new WavFileLister(path1);
        // 		noWavs.listFiles();
        //         System.out.println(noWavs.output());
        // 
        //         System.out.println("Testing mix files only");        
        //         WavFileLister siWavs = new WavFileLister(path2);
        // 		siWavs.listFiles();
        //         System.out.println(siWavs.output());

        WavFileLister siWavsDir = new WavFileLister(path5);
		siWavsDir.listFiles();
		System.out.println(siWavsDir.output());

        //WavFileLister siWavsDir2 = new WavFileLister();

        //WavFileLister siWavsDir3 = new WavFileLister();

        //WavFileLister nada = new WavFileLister();

        //WavFileLister invalid = new WavFileLister();

    }
}
