import java.io.DataInputStream;
import java.io.DataOutputStream;

public class apx extends an7 {
   public int ea;
   public int d9;
   public int d8;
   public int d7;
   public int d6;
   public int d5;
   public int d4;
   public int d3;
   public int d2;
   public int d1;
   public int d0;

   public apx() {
   }

   public apx(aiw var1, int var2) {
      this(var1, var2, 0);
   }

   public apx(aiw var1, int var2, int var3) {
      this.ea = var1.av;
      this.d9 = ajs.a(var1.al * 32.0D);
      this.d8 = ajs.a(var1.ak * 32.0D);
      this.d7 = ajs.a(var1.aj * 32.0D);
      this.d3 = ajs.new(var1.a4 * 256.0F / 360.0F);
      this.d2 = ajs.new(var1.a5 * 256.0F / 360.0F);
      this.d1 = var2;
      this.d0 = var3;
      if (var3 > 0) {
         double var4 = var1.ai;
         double var6 = var1.ah;
         double var8 = var1.ag;
         double var10 = 3.9D;
         if (var4 < -var10) {
            var4 = -var10;
         }

         if (var6 < -var10) {
            var6 = -var10;
         }

         if (var8 < -var10) {
            var8 = -var10;
         }

         if (var4 > var10) {
            var4 = var10;
         }

         if (var6 > var10) {
            var6 = var10;
         }

         if (var8 > var10) {
            var8 = var10;
         }

         this.d6 = (int)(var4 * 8000.0D);
         this.d5 = (int)(var6 * 8000.0D);
         this.d4 = (int)(var8 * 8000.0D);
      }

   }

   public void for(DataInputStream var1) {
      this.ea = var1.readInt();
      this.d1 = var1.readByte();
      this.d9 = var1.readInt();
      this.d8 = var1.readInt();
      this.d7 = var1.readInt();
      this.d3 = var1.readByte();
      this.d2 = var1.readByte();
      this.d0 = var1.readInt();
      if (this.d0 > 0) {
         this.d6 = var1.readShort();
         this.d5 = var1.readShort();
         this.d4 = var1.readShort();
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.ea);
      var1.writeByte(this.d1);
      var1.writeInt(this.d9);
      var1.writeInt(this.d8);
      var1.writeInt(this.d7);
      var1.writeByte(this.d3);
      var1.writeByte(this.d2);
      var1.writeInt(this.d0);
      if (this.d0 > 0) {
         var1.writeShort(this.d6);
         var1.writeShort(this.d5);
         var1.writeShort(this.d4);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 21 + this.d0 > 0 ? 6 : 0;
   }
}
