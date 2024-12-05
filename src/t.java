class t extends Thread {
   // $FF: synthetic field
   final u a;

   t(u var1) {
      this.a = var1;
   }

   public void run() {
      try {
         if (u.a(this.a) != null) {
            u.a(this.a, u.a(this.a), u.int(this.a), u.try(this.a), u.if(this.a));
         } else if (u.int(this.a).exists()) {
            u.a(this.a, u.a(this.a, u.int(this.a), u.try(this.a), u.if(this.a)));
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         u.a(this.a, false);
      }

   }
}
