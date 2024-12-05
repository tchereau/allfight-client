import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class aok extends an7 {
   private int[] bT;
   private int[] bS;
   public int[] bV;
   public int[] bU;
   private byte[] bR;
   private byte[][] bQ;
   private int bP;
   private boolean bO;
   private static byte[] bN = new byte[0];

   public aok() {
   }

   public aok(List var1) {
      int var2 = var1.size();
      this.bT = new int[var2];
      this.bS = new int[var2];
      this.bV = new int[var2];
      this.bU = new int[var2];
      this.bQ = new byte[var2][];
      this.bO = !var1.isEmpty() && !((xx)var1.get(0)).d.n.for;
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         xx var5 = (xx)var1.get(var4);
         aol var6 = aom.a(var5, true, 65535);
         if (bN.length < var3 + var6.if.length) {
            byte[] var7 = new byte[var3 + var6.if.length];
            System.arraycopy(bN, 0, var7, 0, bN.length);
            bN = var7;
         }

         System.arraycopy(var6.if, 0, bN, var3, var6.if.length);
         var3 += var6.if.length;
         this.bT[var4] = var5.b;
         this.bS[var4] = var5.void;
         this.bV[var4] = var6.a;
         this.bU[var4] = var6.do;
         this.bQ[var4] = var6.if;
      }

      Deflater var11 = new Deflater(-1);

      try {
         var11.setInput(bN, 0, var3);
         var11.finish();
         this.bR = new byte[var3];
         this.bP = var11.deflate(this.bR);
      } finally {
         var11.end();
      }

   }

   public void for(DataInputStream var1) {
      short var2 = var1.readShort();
      this.bP = var1.readInt();
      this.bO = var1.readBoolean();
      this.bT = new int[var2];
      this.bS = new int[var2];
      this.bV = new int[var2];
      this.bU = new int[var2];
      this.bQ = new byte[var2][];
      if (bN.length < this.bP) {
         bN = new byte[this.bP];
      }

      var1.readFully(bN, 0, this.bP);
      byte[] var3 = new byte[196864 * var2];
      Inflater var4 = new Inflater();
      var4.setInput(bN, 0, this.bP);

      try {
         var4.inflate(var3);
      } catch (DataFormatException var12) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         this.bT[var6] = var1.readInt();
         this.bS[var6] = var1.readInt();
         this.bV[var6] = var1.readShort();
         this.bU[var6] = var1.readShort();
         int var7 = 0;
         int var8 = 0;

         int var9;
         for(var9 = 0; var9 < 16; ++var9) {
            var7 += this.bV[var6] >> var9 & 1;
            var8 += this.bU[var6] >> var9 & 1;
         }

         var9 = 2048 * 4 * var7 + 256;
         var9 += 2048 * var8;
         if (this.bO) {
            var9 += 2048 * var7;
         }

         this.bQ[var6] = new byte[var9];
         System.arraycopy(var3, var5, this.bQ[var6], 0, var9);
         var5 += var9;
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.bT.length);
      var1.writeInt(this.bP);
      var1.writeBoolean(this.bO);
      var1.write(this.bR, 0, this.bP);

      for(int var2 = 0; var2 < this.bT.length; ++var2) {
         var1.writeInt(this.bT[var2]);
         var1.writeInt(this.bS[var2]);
         var1.writeShort((short)(this.bV[var2] & '\uffff'));
         var1.writeShort((short)(this.bU[var2] & '\uffff'));
      }

   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 6 + this.bP + 12 * this.z();
   }

   public int a(int var1) {
      return this.bT[var1];
   }

   public int do(int var1) {
      return this.bS[var1];
   }

   public int z() {
      return this.bT.length;
   }

   public byte[] if(int var1) {
      return this.bQ[var1];
   }
}
