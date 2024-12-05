class apz extends Thread {
   // $FF: synthetic field
   final ap7 a;

   apz(ap7 var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if (ap7.do(this.a)) {
            ap7.new(this.a).interrupt();
            this.a.a("disconnect.closed");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
