import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class apd extends an7 {
   public int da;
   public int c9;
   public byte[] dd;
   public int dc;
   private static byte[] db = new byte[0];

   public apd() {
      this.else = true;
   }

   public apd(int var1, int var2, short[] var3, int var4, y6 var5) {
      this.else = true;
      this.da = var1;
      this.c9 = var2;
      this.dc = var4;
      int var6 = 4 * var4;
      xx var7 = var5.byte(var1, var2);

      try {
         if (var4 >= 64) {
            this.new.a("ChunkTilesUpdatePacket compress " + var4);
            if (db.length < var6) {
               db = new byte[var6];
            }
         } else {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream(var6);
            DataOutputStream var9 = new DataOutputStream(var8);

            for(int var10 = 0; var10 < var4; ++var10) {
               int var11 = var3[var10] >> 12 & 15;
               int var12 = var3[var10] >> 8 & 15;
               int var13 = var3[var10] & 255;
               var9.writeShort(var3[var10]);
               var9.writeShort((short)((var7.int(var11, var13, var12) & 4095) << 4 | var7.new(var11, var13, var12) & 15));
            }

            this.dd = var8.toByteArray();
            if (this.dd.length != var6) {
               throw new RuntimeException("Expected length " + var6 + " doesn't match received length " + this.dd.length);
            }
         }
      } catch (IOException var14) {
         this.new.a("Couldn't create chunk packet", (Throwable)var14);
         this.dd = null;
      }

   }

   public void for(DataInputStream var1) {
      this.da = var1.readInt();
      this.c9 = var1.readInt();
      this.dc = var1.readShort() & '\uffff';
      int var2 = var1.readInt();
      if (var2 > 0) {
         this.dd = new byte[var2];
         var1.readFully(this.dd);
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.da);
      var1.writeInt(this.c9);
      var1.writeShort((short)this.dc);
      if (this.dd != null) {
         var1.writeInt(this.dd.length);
         var1.write(this.dd);
      } else {
         var1.writeInt(0);
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 10 + this.dc * 4;
   }
}
