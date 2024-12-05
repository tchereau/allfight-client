import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bg {
   private final Set char;
   private final List case;
   private int byte;
   private int try;
   private final int new;
   private final int int;
   private final boolean for;
   private final int do;
   private be if;
   private final String a;

   public bg(String var1, int var2, int var3, boolean var4) {
      this(var1, var2, var3, var4, 0);
   }

   public bg(String var1, int var2, int var3, boolean var4, int var5) {
      this.char = new HashSet(256);
      this.case = new ArrayList(256);
      this.byte = 0;
      this.try = 0;
      this.a = var1;
      this.new = var2;
      this.int = var3;
      this.for = var4;
      this.do = var5;
   }

   public void do(bd var1) {
      if (this.do > 0) {
         var1.if(this.do);
      }

      this.char.add(var1);
   }

   public be if() {
      if (this.for) {
         this.byte = this.a(this.byte);
         this.try = this.a(this.try);
      }

      this.if = bc.do().a(this.a, 1, this.byte, this.try, 6408);
      this.if.a(this.if.int(), -65536);
      List var1 = this.a();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         bi var3 = (bi)var1.get(var2);
         bd var4 = var3.do();
         this.if.a(var3.if(), var3.a(), var4.int(), var4.a());
      }

      bc.do().a(this.a, this.if);
      return this.if;
   }

   public void do() {
      bd[] var1 = (bd[])this.char.toArray(new bd[this.char.size()]);
      Arrays.sort(var1);
      this.if = null;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         bd var3 = var1[var2];
         if (!this.if(var3)) {
            throw new bf(var3);
         }
      }

   }

   public List a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.case.iterator();

      while(var2.hasNext()) {
         bi var3 = (bi)var2.next();
         var3.a((List)var1);
      }

      return var1;
   }

   private int a(int var1) {
      int var2 = var1 - 1;
      var2 |= var2 >> 1;
      var2 |= var2 >> 2;
      var2 |= var2 >> 4;
      var2 |= var2 >> 8;
      var2 |= var2 >> 16;
      return var2 + 1;
   }

   private boolean if(bd var1) {
      for(int var2 = 0; var2 < this.case.size(); ++var2) {
         if (((bi)this.case.get(var2)).a(var1)) {
            return true;
         }

         var1.do();
         if (((bi)this.case.get(var2)).a(var1)) {
            return true;
         }

         var1.do();
      }

      return this.a(var1);
   }

   private boolean a(bd var1) {
      int var2 = Math.min(var1.if(), var1.for());
      boolean var3 = this.byte == 0 && this.try == 0;
      boolean var4;
      if (this.for) {
         int var5 = this.a(this.byte);
         int var6 = this.a(this.try);
         int var7 = this.a(this.byte + var2);
         int var8 = this.a(this.try + var2);
         boolean var9 = var7 <= this.new;
         boolean var10 = var8 <= this.int;
         if (!var9 && !var10) {
            return false;
         }

         int var11 = Math.max(var1.if(), var1.for());
         if (var3 && !var9 && this.a(this.try + var11) > this.int) {
            return false;
         }

         boolean var12 = var5 != var7;
         boolean var13 = var6 != var8;
         if (var12 ^ var13) {
            var4 = var12 && var9;
         } else {
            var4 = var9 && var5 <= var6;
         }
      } else {
         boolean var14 = this.byte + var2 <= this.new;
         boolean var16 = this.try + var2 <= this.int;
         if (!var14 && !var16) {
            return false;
         }

         var4 = (var3 || this.byte <= this.try) && var14;
      }

      bi var15;
      if (var4) {
         if (var1.for() > var1.if()) {
            var1.do();
         }

         if (this.try == 0) {
            this.try = var1.if();
         }

         var15 = new bi(this.byte, 0, var1.for(), this.try);
         this.byte += var1.for();
      } else {
         var15 = new bi(0, this.try, this.byte, var1.if());
         this.try += var1.if();
      }

      var15.a(var1);
      this.case.add(var15);
      return true;
   }
}
