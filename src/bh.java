import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class bh implements ajd {
   private final String void;
   protected be h;
   protected List g;
   private List long;
   protected boolean f;
   protected int e;
   protected int d;
   private int goto;
   private int else;
   private float char;
   private float case;
   private float byte;
   private float try;
   private float new;
   private float int;
   protected int c = 0;
   protected int b = 0;
   private int for = -1;

   public static bh a(String var0) {
      return (bh)("clock".equals(var0) ? new ba() : ("compass".equals(var0) ? new a9() : new bh(var0)));
   }

   protected bh(String var1) {
      this.void = var1;
   }

   public void a(be var1, List var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.h = var1;
      this.g = var2;
      this.e = var3;
      this.d = var4;
      this.goto = var5;
      this.else = var6;
      this.f = var7;
      float var8 = 0.01F / (float)var1.new();
      float var9 = 0.01F / (float)var1.try();
      this.char = (float)var3 / (float)var1.new() + var8;
      this.case = (float)(var3 + var5) / (float)var1.new() - var8;
      this.byte = (float)var4 / (float)var1.try() + var9;
      this.try = (float)(var4 + var6) / (float)var1.try() - var9;
      this.new = (float)var5 / 16.0F;
      this.int = (float)var6 / 16.0F;
   }

   public void a(bh var1) {
      this.a(var1.h, var1.g, var1.e, var1.d, var1.goto, var1.else, var1.f);
   }

   public int case() {
      return this.e;
   }

   public int try() {
      return this.d;
   }

   public float a() {
      return this.char;
   }

   public float byte() {
      return this.case;
   }

   public float if(double var1) {
      float var3 = this.case - this.char;
      return this.char + var3 * ((float)var1 / 16.0F);
   }

   public float int() {
      return this.byte;
   }

   public float do() {
      return this.try;
   }

   public float a(double var1) {
      float var3 = this.try - this.byte;
      return this.byte + var3 * ((float)var1 / 16.0F);
   }

   public String if() {
      return this.void;
   }

   public int new() {
      return this.h.new();
   }

   public int for() {
      return this.h.try();
   }

   public void else() {
      if (this.long != null) {
         ajl var1 = (ajl)this.long.get(this.c);
         ++this.b;
         if (this.b >= (Integer)var1.a()) {
            int var2 = (Integer)var1.if();
            this.c = (this.c + 1) % this.long.size();
            this.b = 0;
            var1 = (ajl)this.long.get(this.c);
            int var3 = (Integer)var1.if();
            if (var2 != var3 && var3 >= 0 && var3 < this.g.size()) {
               this.h.a(this.e, this.d, (be)this.g.get(var3), this.f);
            }
         }
      } else {
         int var4 = this.c;
         this.c = (this.c + 1) % this.g.size();
         if (var4 != this.c) {
            this.h.a(this.e, this.d, (be)this.g.get(this.c), this.f);
         }
      }

   }

   public void a(BufferedReader var1) {
      ArrayList var2 = new ArrayList();

      try {
         for(String var3 = var1.readLine(); var3 != null; var3 = var1.readLine()) {
            var3 = var3.trim();
            if (var3.length() > 0) {
               String[] var4 = var3.split(",");
               String[] var5 = var4;
               int var6 = var4.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  String var8 = var5[var7];
                  int var9 = var8.indexOf(42);
                  if (var9 > 0) {
                     Integer var10 = new Integer(var8.substring(0, var9));
                     Integer var11 = new Integer(var8.substring(var9 + 1));
                     var2.add(new ajl(var10, var11));
                  } else {
                     var2.add(new ajl(new Integer(var8), 1));
                  }
               }
            }
         }
      } catch (Exception var12) {
         System.err.println("Failed to read animation info for " + this.void + ": " + var12.getMessage());
      }

      if (!var2.isEmpty() && var2.size() < 600) {
         this.long = var2;
      }

   }

   public be char() {
      return this.h;
   }

   public int goto() {
      return this.for;
   }

   public void a(int var1) {
      this.for = var1;
   }

   public boolean a(bc var1, aj var2, String var3, String var4, BufferedImage var5, ArrayList var6) {
      return false;
   }
}
