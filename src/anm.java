import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class anm extends an7 {
   public String Y = "";
   public String X = "";
   public String ad = "";
   public String ac = "";
   public Collection ab = new ArrayList();
   public int aa = 0;
   public int Z;

   public anm() {
   }

   public anm(no var1, int var2) {
      this.Y = var1.try();
      this.aa = var2;
      if (var2 == 0 || var2 == 2) {
         this.X = var1.new();
         this.ad = var1.do();
         this.ac = var1.a();
         this.Z = var1.byte();
      }

      if (var2 == 0) {
         this.ab.addAll(var1.int());
      }

   }

   public anm(no var1, Collection var2, int var3) {
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.aa = var3;
         this.Y = var1.try();
         this.ab.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   public void for(DataInputStream var1) {
      this.Y = a(var1, 16);
      this.aa = var1.readByte();
      if (this.aa == 0 || this.aa == 2) {
         this.X = a(var1, 32);
         this.ad = a(var1, 16);
         this.ac = a(var1, 16);
         this.Z = var1.readByte();
      }

      if (this.aa == 0 || this.aa == 3 || this.aa == 4) {
         short var2 = var1.readShort();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.ab.add(a(var1, 16));
         }
      }

   }

   public void a(DataOutputStream var1) {
      a(this.Y, var1);
      var1.writeByte(this.aa);
      if (this.aa == 0 || this.aa == 2) {
         a(this.X, var1);
         a(this.ad, var1);
         a(this.ac, var1);
         var1.writeByte(this.Z);
      }

      if (this.aa == 0 || this.aa == 3 || this.aa == 4) {
         var1.writeShort(this.ab.size());
         Iterator var2 = this.ab.iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            a(var3, var1);
         }
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 3 + this.Y.length();
   }
}
