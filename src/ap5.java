class ap5 extends Thread {
   // $FF: synthetic field
   final ap7 a;

   ap5(ap7 var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      ap7.y.getAndIncrement();

      try {
         while(ap7.do(this.a) && !ap7.try(this.a)) {
            while(true) {
               if (!ap7.byte(this.a)) {
                  try {
                     sleep(2L);
                  } catch (InterruptedException var5) {
                  }
               }
            }
         }
      } finally {
         ap7.y.getAndDecrement();
      }

   }
}
