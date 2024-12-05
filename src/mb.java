import java.util.Stack;

final class mb implements lc {
   private final Stack if = new Stack();
   private l5 a;

   lh else() {
      return (lh)this.a.a();
   }

   public void do() {
   }

   public void char() {
   }

   public void try() {
      me var1 = l4.int();
      this.a((l5)var1);
      this.if.push(new ma(this, var1));
   }

   public void int() {
      this.if.pop();
   }

   public void if() {
      lj var1 = l4.a();
      this.a((l5)var1);
      this.if.push(new l9(this, var1));
   }

   public void case() {
      this.if.pop();
   }

   public void do(String var1) {
      mc var2 = mc.do().if(l4.if(var1));
      ((l7)this.if.peek()).a(var2);
      this.if.push(new l8(this, var2));
   }

   public void new() {
      this.if.pop();
   }

   public void if(String var1) {
      this.if(l4.a(var1));
   }

   public void for() {
      this.if(l4.do());
   }

   public void a(String var1) {
      this.if((l5)l4.if(var1));
   }

   public void a() {
      this.if(l4.if());
   }

   public void byte() {
      this.if(l4.for());
   }

   private void a(l5 var1) {
      if (this.a == null) {
         this.a = var1;
      } else {
         this.if(var1);
      }

   }

   private void if(l5 var1) {
      ((l7)this.if.peek()).a(var1);
   }
}
