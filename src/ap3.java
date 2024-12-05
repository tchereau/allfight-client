import java.io.IOException;

class ap3 extends Thread {
   // $FF: synthetic field
   final ap7 a;

   ap3(ap7 var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      ap7.x.getAndIncrement();

      try {
         while(ap7.do(this.a)) {
            boolean var1;
            for(var1 = false; ap7.for(this.a); var1 = true) {
            }

            try {
               if (var1 && ap7.a(this.a) != null) {
                  ap7.a(this.a).flush();
               }
            } catch (IOException var8) {
               if (!ap7.if(this.a)) {
                  ap7.a((ap7)this.a, (Exception)var8);
               }

               var8.printStackTrace();
            }

            try {
               sleep(2L);
            } catch (InterruptedException var7) {
            }
         }
      } finally {
         ap7.x.getAndDecrement();
      }

   }
}
