class all extends Thread {
   // $FF: synthetic field
   final alm a;

   all(alm var1) {
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
         }
      }
   }
}
