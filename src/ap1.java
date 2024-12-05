class ap1 extends Thread {
   // $FF: synthetic field
   final ap7 a;

   ap1(ap7 var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if (ap7.int(this.a).isAlive()) {
            try {
               ap7.int(this.a).stop();
            } catch (Throwable var3) {
            }
         }

         if (ap7.new(this.a).isAlive()) {
            try {
               ap7.new(this.a).stop();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
