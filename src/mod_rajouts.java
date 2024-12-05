import java.util.Random;

public class mod_rajouts extends xu {
   public static final pa U;
   public static final pa aa;
   public static final pa X;
   public static final pa ad;
   public static final pa ae;
   public static final r0 P;
   public static final r0 ac;
   public static final pa M;
   public static abr W;
   public static final pa af;
   public static final pa Q;
   public static final pa ag;
   public static final pa Y;
   public static final pa N;
   public static final pa ai;
   public static final pa ah;
   public static final pa R;
   public static final pa Z;
   public static final pa ab;
   public static final pa O;
   public static final pa S;
   public static final pa V;
   public static final pa T;
   public static abr aj;

   public void if() {
      ModLoader.a(new abp(W, 1), "#X#", "#X#", '#', abr.cn, 'X', P);
      ModLoader.a(new abp(M, 1), "###", "#u#", "###", '#', abr.N, 'u', pa.ax);
      ModLoader.a(new abp(M, 1), "#X#", "#X#", 'X', P, '#', abr.cn);
      ModLoader.a(new abp(U, 6), "###", "###", '#', pa.bs);
      ModLoader.a(new abp(X, 5), "#  ", "## ", "###", '#', pa.bs);
      ModLoader.a(new abp(ad, 5), "#  ", "## ", "###", '#', pa.aD);
      ModLoader.a(new abp(ae, 5), "#  ", "## ", "###", '#', pa.aN);
      ModLoader.a(new abp(aa, 6), "###", "###", '#', pa.aN);
      ModLoader.a(new abp(ag, 16), "###", "###", '#', R);
      ModLoader.a(new abp(Y, 16), "###", "###", '#', Z);
      ModLoader.a(new abp(N, 16), "###", "###", '#', ab);
      ModLoader.a(new abp(ai, 16), "###", "###", '#', O);
      ModLoader.a(new abp(ah, 16), "###", "###", '#', S);
      ModLoader.if(new abp(R, 1), pa.aD, new abp(abr.b9, 1, 1));
      ModLoader.if(new abp(Z, 1), pa.aD, new abp(abr.b9, 1, 4));
      ModLoader.if(new abp(ab, 1), pa.aD, new abp(abr.b9, 1, 2));
      ModLoader.if(new abp(O, 1), pa.aD, new abp(abr.b9, 1, 3));
      ModLoader.if(new abp(S, 1), pa.aD, new abp(abr.b9, 1, 0));
      ModLoader.a(U);
      ModLoader.a(X);
      ModLoader.a(ad);
      ModLoader.a(ae);
      ModLoader.a(aa);
      ModLoader.a(M);
      ModLoader.a((pa)P);
      ModLoader.a((pa)ac);
      ModLoader.a(af);
      ModLoader.a(Q);
      ModLoader.a(ag);
      ModLoader.a(Y);
      ModLoader.a(N);
      ModLoader.a(ai);
      ModLoader.a(ah);
      ModLoader.a(R);
      ModLoader.a(Z);
      ModLoader.a(ab);
      ModLoader.a(O);
      ModLoader.a(S);
      ModLoader.a(V);
      ModLoader.a(T);
      ModLoader.a((Object)P, (String)"Enderflow");
      ModLoader.a((Object)ac, (String)"Marguerite");
      ModLoader.a((Object)M, (String)"Bloc Ancestral");
      ModLoader.a((Object)U, (String)"Barrière en Obsidian");
      ModLoader.a((Object)aa, (String)"Barrière GlowStone");
      ModLoader.a((Object)ad, (String)"Escalier de verre");
      ModLoader.a((Object)ae, (String)"Escalier de GlowStone");
      ModLoader.a((Object)X, (String)"Escalier d'Obsidian");
      ModLoader.a((Object)W, (String)"Maxi Pétard");
      ModLoader.a((Object)af, (String)"Uporium");
      ModLoader.a((Object)Q, (String)"Randomium");
      ModLoader.a((Object)ag, (String)"Vitre Rouge");
      ModLoader.a((Object)Y, (String)"Vitre Bleu");
      ModLoader.a((Object)N, (String)"Vitre Verte");
      ModLoader.a((Object)ai, (String)"Vitre Marron");
      ModLoader.a((Object)ah, (String)"Vitre Noire");
      ModLoader.a((Object)R, (String)"Vitre Rouge");
      ModLoader.a((Object)Z, (String)"Vitre Bleu");
      ModLoader.a((Object)ab, (String)"Vitre Verte");
      ModLoader.a((Object)O, (String)"Vitre Marron");
      ModLoader.a((Object)S, (String)"Vitre Noire");
      ModLoader.a((Object)V, (String)"JukeBox Full");
      ModLoader.a((Object)T, (String)"Porte Secrète");
      ModLoader.a((Object)aj, (String)"Porte Secrète");
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      for(int var5 = 0; var5 < 7; ++var5) {
         int var6 = var3 + var2.nextInt(4);
         int var7 = var4 + var2.nextInt(4);
         var1.a(var6, var7);
         (new wq(af.void, 2)).a(var1, var2, var6, 20, var7);
         (new wq(Q.void, 2)).a(var1, var2, var6, 20, var7);
      }

   }

   public void long() {
   }

   public String do() {
      return "1.5";
   }

   static {
      U = (new q8(205, "obsidian", ts.v)).if(50.0F).a(10.0F).a(pa.N).a("ObsiFence").a(acn.case);
      aa = (new q8(206, "GlowStone", ts.i)).if(1.0F).do(1.0F).a(3.0F).a(pa.N).a("GlowFence").a(acn.d);
      X = (new pk(207, pa.bs, 0)).if(50.0F).a(10.0F).a("ObsiStairs").a(acn.d);
      ad = (new pk(208, pa.aD, 1)).a((String)"GlassStairs").new(0).a(acn.d);
      ae = (new pk(209, pa.aN, 1)).do(1.0F).a("GlowStairs").a(acn.d);
      P = (r0)((r0)(new r0(210)).if(1.0F).a(pa.P).a("EnderFlow"));
      ac = (r0)(new r0(211)).if(0.0F).a(pa.P).a("Marguerite");
      M = (new b8(212, 0)).a("McBlock").if(3.0F).a(pa.N).a(4.0F).do(1.0F).a(acn.d);
      W = (new hh(1056, 0, 0.0F, false)).j().if("Petard");
      af = (new p9(215)).if(5.0F).a(10.0F).a(pa.N).a("Uporium").a(acn.d);
      Q = (new p9(216)).if(3.0F).a(5.0F).a(pa.N).a("Randomium").a(acn.d);
      ag = (new pb(217, "redglass", "thinglass_top", ts.i, false)).if(3.0F).a(5.0F).a(pa.N).a("redglass").a(acn.d);
      Y = (new pb(218, "blueglass", "thinglass_top", ts.i, false)).if(3.0F).a(5.0F).a(pa.N).a("blueglass").a(acn.d);
      N = (new pb(219, "greenglass", "thinglass_top", ts.i, false)).if(3.0F).a(5.0F).a(pa.N).a("greenglass").a(acn.d);
      ai = (new pb(220, "brownglass", "thinglass_top", ts.i, false)).if(3.0F).a(5.0F).a(pa.N).a("brownglass").a(acn.d);
      ah = (new pb(221, "blackglass", "thinglass_top", ts.i, false)).if(3.0F).a(5.0F).a(pa.N).a("blackglass").a(acn.d);
      R = (new q3(222, ts.i, false)).if(0.3F).a(pa.J).a("redglassfull");
      Z = (new q3(223, ts.i, false)).if(0.3F).a(pa.J).a("blueglassfull");
      ab = (new q3(224, ts.i, false)).if(0.3F).a(pa.J).a("greenglassfull");
      O = (new q3(225, ts.i, false)).if(0.3F).a(pa.J).a("brownglassfull");
      S = (new q3(226, ts.i, false)).if(0.3F).a(pa.J).a("blackglassfull");
      V = (new y8(227)).if(2.0F).a(10.0F).a(pa.N).a("jukeboxfull");
      T = (new g7(228, ts.w)).if(3.0F).a(pa.L).a("secretDoor").g();
      aj = (new zb(1071, ts.w)).if("secretDoor").a((acn)null);
   }
}
