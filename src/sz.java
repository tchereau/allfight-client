import java.io.File;

public class sz extends su {
   public sz(File var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public xt a(xl var1) {
      File var2 = this.try();
      File var3;
      if (var1 instanceof xk) {
         var3 = new File(var2, "DIM-1");
         var3.mkdirs();
         return new xn(var3);
      } else if (var1 instanceof xi) {
         var3 = new File(var2, "DIM1");
         var3.mkdirs();
         return new xn(var3);
      } else {
         return new xn(var2);
      }
   }

   public void a(ss var1, aqv var2) {
      var1.a(19133);
      super.a(var1, var2);
   }

   public void do() {
      try {
         sb.if.if();
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      xo.a();
   }
}
