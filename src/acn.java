import java.util.List;

public class acn {
   public static final acn[] e = new acn[12];
   public static final acn d = new acm(0, "buildingBlocks");
   public static final acn c = new aci(1, "decorations");
   public static final acn b = new ach(2, "redstone");
   public static final acn void = new acg(3, "transportation");
   public static final acn long = new acf(4, "misc");
   public static final acn goto = (new ace(5, "search")).a("search.png");
   public static final acn else = new acd(6, "food");
   public static final acn char = new acc(7, "tools");
   public static final acn case = new acb(8, "combat");
   public static final acn byte = new acl(9, "brewing");
   public static final acn try = new ack(10, "materials");
   public static final acn new = (new acj(11, "inventory")).a("survival_inv.png").int().do();
   private final int int;
   private final String for;
   private String do = "list_items.png";
   private boolean if = true;
   private boolean a = true;

   public acn(int var1, String var2) {
      this.int = var1;
      this.for = var2;
      e[var1] = this;
   }

   public int goto() {
      return this.int;
   }

   public String char() {
      return this.for;
   }

   public String case() {
      return aqy.if().a("itemGroup." + this.char());
   }

   public abr a() {
      return abr.ai[this.else()];
   }

   public int else() {
      return 1;
   }

   public String for() {
      return this.do;
   }

   public acn a(String var1) {
      this.do = var1;
      return this;
   }

   public boolean byte() {
      return this.a;
   }

   public acn do() {
      this.a = false;
      return this;
   }

   public boolean if() {
      return this.if;
   }

   public acn int() {
      this.if = false;
      return this;
   }

   public int try() {
      return this.int % 6;
   }

   public boolean new() {
      return this.int < 6;
   }

   public void a(List var1) {
      abr[] var2 = abr.ai;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abr var5 = var2[var4];
         if (var5 != null && var5.long() == this) {
            var5.a(var5.A, this, var1);
         }
      }

   }

   public void a(List var1, z2... var2) {
      z3[] var3 = z3.n;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         z3 var6 = var3[var5];
         if (var6 != null && var6.goto != null) {
            boolean var7 = false;

            for(int var8 = 0; var8 < var2.length && !var7; ++var8) {
               if (var6.goto == var2[var8]) {
                  var7 = true;
               }
            }

            if (var7) {
               var1.add(abr.bj.a(new zw(var6, var6.do())));
            }
         }
      }

   }
}
