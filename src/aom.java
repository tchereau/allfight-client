import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class aom extends an7 {
   public int b4;
   public int b3;
   public int b2;
   public int b1;
   private byte[] bZ;
   private byte[] bY;
   public boolean b0;
   private int bX;
   private static byte[] bW = new byte[196864];

   public aom() {
      this.else = true;
   }

   public aom(xx var1, boolean var2, int var3) {
      this.else = true;
      this.b4 = var1.b;
      this.b3 = var1.void;
      this.b0 = var2;
      aol var4 = a(var1, var2, var3);
      Deflater var5 = new Deflater(-1);
      this.b1 = var4.do;
      this.b2 = var4.a;

      try {
         this.bY = var4.if;
         var5.setInput(var4.if, 0, var4.if.length);
         var5.finish();
         this.bZ = new byte[var4.if.length];
         this.bX = var5.deflate(this.bZ);
      } finally {
         var5.end();
      }

   }

   public void for(DataInputStream var1) {
      this.b4 = var1.readInt();
      this.b3 = var1.readInt();
      this.b0 = var1.readBoolean();
      this.b2 = var1.readShort();
      this.b1 = var1.readShort();
      this.bX = var1.readInt();
      if (bW.length < this.bX) {
         bW = new byte[this.bX];
      }

      var1.readFully(bW, 0, this.bX);
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         var2 += this.b2 >> var3 & 1;
      }

      var3 = 12288 * var2;
      if (this.b0) {
         var3 += 256;
      }

      this.bY = new byte[var3];
      Inflater var4 = new Inflater();
      var4.setInput(bW, 0, this.bX);

      try {
         var4.inflate(this.bY);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.b4);
      var1.writeInt(this.b3);
      var1.writeBoolean(this.b0);
      var1.writeShort((short)(this.b2 & '\uffff'));
      var1.writeShort((short)(this.b1 & '\uffff'));
      var1.writeInt(this.bX);
      var1.write(this.bZ, 0, this.bX);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 17 + this.bX;
   }

   public byte[] A() {
      return this.bY;
   }

   public static aol a(xx var0, boolean var1, int var2) {
      int var3 = 0;
      xw[] var4 = var0.else();
      int var5 = 0;
      aol var6 = new aol();
      byte[] var7 = bW;
      if (var1) {
         var0.try = true;
      }

      int var8;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if (var4[var8] != null && (!var1 || !var4[var8].new()) && (var2 & 1 << var8) != 0) {
            var6.a |= 1 << var8;
            if (var4[var8].try() != null) {
               var6.do |= 1 << var8;
               ++var5;
            }
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if (var4[var8] != null && (!var1 || !var4[var8].new()) && (var2 & 1 << var8) != 0) {
            byte[] var9 = var4[var8].char();
            System.arraycopy(var9, 0, var7, var3, var9.length);
            var3 += var9.length;
         }
      }

      xz var10;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if (var4[var8] != null && (!var1 || !var4[var8].new()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].a();
            System.arraycopy(var10.if, 0, var7, var3, var10.if.length);
            var3 += var10.if.length;
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if (var4[var8] != null && (!var1 || !var4[var8].new()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].do();
            System.arraycopy(var10.if, 0, var7, var3, var10.if.length);
            var3 += var10.if.length;
         }
      }

      if (!var0.d.n.for) {
         for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].new()) && (var2 & 1 << var8) != 0) {
               var10 = var4[var8].byte();
               System.arraycopy(var10.if, 0, var7, var3, var10.if.length);
               var3 += var10.if.length;
            }
         }
      }

      if (var5 > 0) {
         for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].new()) && var4[var8].try() != null && (var2 & 1 << var8) != 0) {
               var10 = var4[var8].try();
               System.arraycopy(var10.if, 0, var7, var3, var10.if.length);
               var3 += var10.if.length;
            }
         }
      }

      if (var1) {
         byte[] var11 = var0.new();
         System.arraycopy(var11, 0, var7, var3, var11.length);
         var3 += var11.length;
      }

      var6.if = new byte[var3];
      System.arraycopy(var7, 0, var6.if, 0, var3);
      return var6;
   }
}
