package a.a.a;

import a.a.SoundSystemException;

public class LibraryJavaSound$Exception extends SoundSystemException {
   public static final int MIXER_PROBLEM = 101;
   public static LibraryJavaSound$MixerRanking mixerRanking = null;

   public LibraryJavaSound$Exception(String var1) {
      super(var1);
   }

   public LibraryJavaSound$Exception(String var1, int var2) {
      super(var1, var2);
   }

   public LibraryJavaSound$Exception(String var1, LibraryJavaSound$MixerRanking var2) {
      super(var1, 101);
      mixerRanking = var2;
   }
}
