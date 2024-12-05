import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

public class zl extends ArrayList {
   public zl() {
   }

   public zl(aqv var1) {
      this.a(var1);
   }

   public zm a(abp var1, abp var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         zm var6 = (zm)this.get(var3);
         return var1.new != var6.byte().new || (var2 != null || var6.try()) && (!var6.try() || var2 == null || var6.for().new != var2.new) || var1.if < var6.byte().if || var6.try() && var2.if < var6.for().if ? null : var6;
      } else {
         for(int var4 = 0; var4 < this.size(); ++var4) {
            zm var5 = (zm)this.get(var4);
            if (var1.new == var5.byte().new && var1.if >= var5.byte().if && (!var5.try() && var2 == null || var5.try() && var2 != null && var5.for().new == var2.new && var2.if >= var5.for().if)) {
               return var5;
            }
         }

         return null;
      }
   }

   public void a(zm var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         zm var3 = (zm)this.get(var2);
         if (var1.if(var3)) {
            if (var1.a(var3)) {
               this.set(var2, var1);
            }

            return;
         }
      }

      this.add(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeByte((byte)(this.size() & 255));

      for(int var2 = 0; var2 < this.size(); ++var2) {
         zm var3 = (zm)this.get(var2);
         an7.a(var3.byte(), var1);
         an7.a(var3.if(), var1);
         abp var4 = var3.for();
         var1.writeBoolean(var4 != null);
         if (var4 != null) {
            an7.a(var4, var1);
         }

         var1.writeBoolean(var3.new());
      }

   }

   public static zl a(DataInputStream var0) {
      zl var1 = new zl();
      int var2 = var0.readByte() & 255;

      for(int var3 = 0; var3 < var2; ++var3) {
         abp var4 = an7.do(var0);
         abp var5 = an7.do(var0);
         abp var6 = null;
         if (var0.readBoolean()) {
            var6 = an7.do(var0);
         }

         boolean var7 = var0.readBoolean();
         zm var8 = new zm(var4, var6, var5);
         if (var7) {
            var8.int();
         }

         var1.add(var8);
      }

      return var1;
   }

   public void a(aqv var1) {
      aqm var2 = var1.void("Recipes");

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         this.add(new zm(var4));
      }

   }

   public aqv a() {
      aqv var1 = new aqv();
      aqm var2 = new aqm("Recipes");

      for(int var3 = 0; var3 < this.size(); ++var3) {
         zm var4 = (zm)this.get(var3);
         var2.a((aqd)var4.do());
      }

      var1.a("Recipes", (aqd)var2);
      return var1;
   }
}
