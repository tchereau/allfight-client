package a.a;

import java.util.ListIterator;

final class SoundSystemConfig$1 extends Thread {
   // $FF: synthetic field
   final String val$srcName;
   // $FF: synthetic field
   final int val$qSize;

   SoundSystemConfig$1(String var1, int var2) {
      this.val$srcName = var1;
      this.val$qSize = var2;
   }

   public void run() {
      synchronized(SoundSystemConfig.access$000()) {
         if (SoundSystemConfig.access$100() != null) {
            ListIterator var2 = SoundSystemConfig.access$100().listIterator();

            while(var2.hasNext()) {
               IStreamListener var3 = (IStreamListener)var2.next();
               if (var3 == null) {
                  var2.remove();
               } else {
                  var3.endOfStream(this.val$srcName, this.val$qSize);
               }
            }

         }
      }
   }
}
