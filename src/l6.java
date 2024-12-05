import java.util.List;
import java.util.Map;

public abstract class l6 {
   l6() {
   }

   public abstract ln for();

   public abstract String a();

   public abstract Map if();

   public abstract List do();

   public final Boolean do(Object... var1) {
      return (Boolean)this.a(lv.a(var1), this, var1);
   }

   public final String for(Object... var1) {
      return (String)this.a(lv.int(var1), this, var1);
   }

   public final String a(Object... var1) {
      return (String)this.a(lv.if(var1), this, var1);
   }

   public final boolean if(Object... var1) {
      return lv.for(var1).a((Object)this);
   }

   public final List int(Object... var1) {
      return (List)this.a(lv.for(var1), this, var1);
   }

   private Object a(lw var1, l6 var2, Object[] var3) {
      try {
         return var1.if(var2);
      } catch (l0 var5) {
         throw ly.a(var5, var3, lx.a(var2));
      }
   }
}
