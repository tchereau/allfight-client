class l8 implements l7 {
   // $FF: synthetic field
   final mc if;
   // $FF: synthetic field
   final mb a;

   l8(mb var1, mc var2) {
      this.a = var1;
      this.if = var2;
   }

   public void a(l5 var1) {
      this.if.a(var1);
   }

   public void a(mc var1) {
      throw new RuntimeException("Coding failure in Argo:  Attempt to add a field to a field.");
   }
}
