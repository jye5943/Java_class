import java.util.Random;

public class Player5 extends Player{
	Player5() {
		this.hp = 6000;
		this.name = "이신우 공주님";
	}
	public int getAttackPower() {
		Random random = new Random();
		int getAtt = random.nextInt(3);
		if (getAtt == 1) {
			System.out.println(this.name + " 드레스업!!! (공격력이 3배가 되었습니다.)");
			return 30;
		} else {
			return 10;
		}
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber < 3) {
			hp = hp - attackPower;
			System.out.println("정형석은 날씬하다.");
		} 
		else if (hitNumber < 6) {
			hp = hp - (attackPower *3);
			System.out.println("정형석은 예쁘다.");
		}
		else if (hitNumber < 9) {
			hp = hp - (attackPower * 4);
			System.out.println("정형석은 귀엽다.");
		}
		else {
			hp = 1;
			System.out.println("공현이는 잘생겼다.");
			System.out.println("1011JLJuLv7JvvvuYLY2JLvuuFFFuuUXS5U5FS5kFkFS1F5FFSSPkkFkXXuv7LYY7LjY7vLjJUYuu2U2YLLjJju111UUvL77LLrr77r7777LLL7vLJLjJL77vLLL777vrrrLYr   .");  
			System.out.println("2SSSk112522uuLjujvLYuLv7YYjuULLY2JJYujUuuJUu21SFkSPkXSSjjvL77;riiiri;iiii:ii;iri77LLuU1u22F2uuY7LLLvvrrrvvJYLvJJuLuu2uJ777vvv7v7rr77Yi   .");  
			System.out.println("j1Yu25JuUX11uYjUJjLv7Lvv7LjujYr7vJLvrvvLLujuLYLjYL77ii:i:i:i:::iii:iii:iii:i:i:ii::iirr77YYJL1uv7LuFUUL7r77v7v777777rr77r;ir7vvLvJuu17   .");  
			System.out.println("YJvvLLJLLLuuuJUUS51JjLJL7L5UuLvLLJSULr7777vvLvL77iiiiii:::iii:::::::::::::::::::;:i:i:iir7LuLvjYY7LLjJ2JLvJJLrrir777vvLLLLujv7L77vu20v   .");  
			System.out.println("u5LL77vYLJvYYjYuuUu2U515uu21uLvL7vJkS2777LLJJLrriii;ii:::iiiii:::::::::::::::i:::::ii;iii;;vuSJJYvr;;vYUJjuS12212FSXFkF5ujukYLLYv771NL   .");  
			System.out.println("SXUYLvLvLLjjUuUU52F55JuuuYu5X11u7;vvU11LLJ2J7iiir;riiiri::iii:i:i:::i:i:i:::::::::i:i:::i:::rvUuuLLLu21uY7YYujU2522U2U1uL7v7Jj555juUGL   ."); 
			System.out.println("Uk1SFS55UUjuuuYU22uF12u5uuY11FUU7rrLJuYYLuL7iiir;;iirriiii:iii:::::::::i::::,::::::::::::::i:iiLSqPX2F1F5u7JujLv7vvv77rv7LLLvjuUYL77Jr   .");  
			System.out.println("u51252S5S551FuuYju55X1F51u2u2US1uLvJuv77vr77rvuvLr7;::i:7i:::::::::::,:::::,..,.....,:::::i:i:::rv1uUjYvFkL7uuuLvr7777v77r777rrr7;rrYi   .");  
			System.out.println("LuLuJujujUu12511LJuSSS2k12jjYuUF1uLYYJJF2UJYjUu1j51U7;iiii::ii:i:i::::::::::::::::,,::::::::::::::7uYYYvv1j77LJuLLYJLL7vvL7L7LvJLL7;7i   .");  
			System.out.println("Jjv7LvL777LYjLUuu7vLuYLYujjvv7LJuJJ1XS0NP0EZZPF5P1XFUUkYvJLLUL7;v7L7777r7r7v7rrr7;i:::::i:::::ii::i:r7Lr7vrv77J2S112FUUu52uv7vJLLYuYSr   .");  
			System.out.println("U1777v77r77v7YLLYY7vLuYjuFSXk8NPFOMOOBOEGO8@0GZPF5GE8M88ZOO8E0XquvJkuvJuuLr7Lvvvvv7:,::::::i:::::::iir7v7L7L77rLJJvJuuLJuUuUJuYY7vLFqL   .");  
			System.out.println("55YvvvJJuYL7v7vY2FF5XF11P0OOOEGO@BMOBOGOBM@NEO5S0k88ZOBBGZMO8OMEXS10GSkN0PkSE1u1k1ZGSv7rii;:i:::::::iir7YjSu2JLvv7vvYLLvLvvLYLLLuLYuS7   .");  
			System.out.println("0OPqEESk1F1F25kP5uvL1ZGOM@@BOZM@BOM@BBO8BMNZPS5EZESB00OEEOEMMOXkqE8qFMZOGMEEMM2qSXq8MBZP21S5UFUvrvr7vYuPqEEqXXFSJvvYYJLYLv7777vYLvrvJ7   .");  
			System.out.println("EOZ0NXNXX11u1uLvJuXZOM@8BBBOGMB8EMBOGOGZ8SXXUP05GE0MZMGEZ00M825N2POX108OG0MPXE8ZZEE8MOMBMZ0qG0ZZGqPkXFEGBOMO8ZO05U2v7r7r77vvL7vLY77rLi   ."); 
			System.out.println("2q1F15FPXk1JLu7v5MOMBBGOBBGOMM8OBM88GMXOF0PuNEqPX8E2O@kN080MSJuk5PO5uNZ800E8OZUZ0Gk0MMO8B@MOXqZNSOMM0q000OGOBBOO0E512Uvrr7r77r;7r7rrv;   .");  
			System.out.println("FFLLuU1uU2S1F5NGMMMOOOMM@MZ8BOGBMMM08NqkX0PYGGSN8OOL@8qN0O8EqU2N5F0SYq8qGE58M8220Pk8MMBGMMBBB88ZZPZqMONENOZ0EGOEOOOqFuFUv7v7777rrrriLi   .");  
			System.out.println("uSJL7vJJLjJFqG8MB@OGEMMO8OGBOOMMqOOZGPPPESNFSMPELkEuOOqX0OOENjJP5uPqJFPSEE00kM2F80NNq88M8ZB@MOM@MMNEOOMOS0Z@O0Z8ZOEOZE55Fj;7vL7vr7r;vr   .");  
			System.out.println("UF1uu777Yu5P8MBMMBOOMEMO8OBMOOMGM8MGXkFP0kq1POEFFXE1JPUXEOMGUYU80YNku5811v:LkkPkZq88EG8k@OOMBOO8MOOZOG8EBNFX@@80MOE8BMOkSP1777Lvv7rrYi   .");  
			System.out.println("Y1JjLL7vY15XGBGZMOGOOMMMMBMMMMG@MMqPkNXEkPSkXPqjZqZk8PUPMESZvUU52jLEuSX5F5LvvY555Oq8EGO5EBXZM@MMOOOMOZGMGOOS1MMOEMOMOOOOPqX1uJuFuJvLjr   .");  
			System.out.println("uuv7LLu251ZM@BMGMZOOMMBO@M8OOZ8GZXGNEkGP51PPPk1JNSuN5Y50EL50XrkSkLLPS2PuY2LuuFEjUSGPEOOUE@BZGZMBMOBOOZEOMGMEE0PBMOME0ZMMOZEqXuJv2uLrL:   .");  
			System.out.println("FXYjUkPkPOMB8EZMMMOMBBGB80E@EPOEqO80kqPqPX58S122q7j@;2NMqLJNSJjG2uJXFF51vUv577k550ZXqMM0FGM@8GZMMM8BO@EGOM8OPOGX8MO@OO0GE8M8FSjvvuJvLi   .");  
			System.out.println("qGXkqqPPOBM8OOBBBMBBMZOMXP@BZN8OOqNF5FPXEXEq1XPZEvOFv2GEk7ukPj2FSvjj5SN5YuSq5:UEFuGPuZOES1@MB8EZOMBOMMB0M8OBM0OZSqNM@OOZMNqEq22YujFFEv   .");  
			System.out.println("LS1kSk0OOMMMOBMOGM@M0OE8Z8M@MM0ZqPXkUSXNXkqJJFS0FB8i7FkvU7ruu1J1SvvJuF5Srr7rLiLUGPu8PNE8X2ZBMBZ08EOM0MB08BGOB@0OBM01EBBG8@GqZOEqkk1SNj   .");  
			System.out.println("LLvL5PZGMM@MGZOM@G8q8MNqOM@MOZqXXFFU1S0X1SSY22101u,.i27i7u7rYPUkZLuuuukFjuS22Y77PNX200GO8jFM@OOZMqMBOZMOMOM08BOZ@M@kEOBEGMMMEqGPS1S1EL   .");  
			System.out.println("POkkFPOMZOGZPGZMOESqON1EB@@ONZXqPX221PXkXS1u25Fqr:.:iXr,ivjv7u7u2u;7vL51vriUrvJ5ukSLPOMZkEFE@MMMZOMBB8GG8ZMOX@BM08MMZ0G@MZOOZ80q5UuXEJ   .");  
			System.out.println("qGqNGOB0NXXG0N00qu2qqu18@MOZ8G0q0PqkqXkUXF575rr7;..:rL7,riYL77vv1u7;v7uvLrirLj21FUq5XOMZkkGkO88OZMMOBMBkGZOGZEMOG0OOMGkO@ZBMM8GZPjuuXL   .");  
			System.out.println("USJ1XEqSFPNZk8ZOX2kPu2kGOM88NGPqPENEPqXSFUYJYL777i,:rY;i:ri7;JuYuXuLu7U27v:7vX5XU2FX28MMFS0ZGMGMGZOMMBMk0ZZG8MEBZ88EGMq5OZqMBBOqXkYuPY   .");  
			System.out.println("5kuLLvLjF1FukEBGqNOPXqMOMB@8qNZEZZZPEZ8GNkq5u11k17UJjuvi7:;iLJ2LUu122u5F7UL7jYU11U55FGMOP2XGOMOG80M8@MMEM8GOqZO0OMZ0MqGXXPS28MMZZ800@2   .");  
			System.out.println("1PYLLY7LJJvJUNG5JjU111kMMOGZqGEZPP5XPNqNNOMOkSSNuU2YJuvv7L7vY5215UkPSE2N5S2Y0SYX2uu15EZOXkP80OOO0GP8EBOkGMG0ZE08P08EG8ZZFX1u5EMMPFu50J   .");  
			System.out.println("kXuJuYJJJJuUqq5SUvL7YvuEESPXNNqF5ujJL7v:rFZOMEE5F5j7rv7LJYSP5kGXGE0SSj1Puu2rUqXqFuU10EZOqSENk0MOGEXP0MO2ZZ@NqM8GOqOG0P8GNSUuu200Su22ZY   .");  
			System.out.println("S025U5kkFkSEOE2k5UjuuUuqPSkkkEk1jJvvri:;:vLuZM0NPFL;:v7Yu5u5PGN0EX7L7LL1ujriivLqXXFkZO00PF001NOMqq8O8BGqZOq@P58OOGPOPXqBGN52Y21q51Sk8U   .");  
			System.out.println("0GNNZZZqqFk1F211SSF1525FqkqFFSSuUuuJ7,,iirujXGOGZ2L7jYLLFFS5PPEXPJ;:;7LruY::i7YuFP0XZES505NkSS8MNFO8MMME0GFB@XFL2ZM8OO0P0XG2UYu22Luu0L   .");  
			System.out.println("0OSS15uUu151J2FFFNqqkqPqZE0k1FJjYLrri::iirvUSNOOZXv7ru1LuXPZSFF22Fi,:;rrrJi::7uuL1PGEZk1FP55Xq0MqS0ZMBZO21k2jr7MO8OBOqPSFXuS21uF1L7jkY   .");  
			System.out.println("qEk52juu22XF1U2U125252SX0Z82uNMPX@@MMMNUSuurYqGEZP1:.iurF1uF2JFF2LL,  :::.:.iruJjjFPOkj2kP5UNXE8N50ZMBGGS7i:FGEMM08ZPP05XUuu51FX0SU5OL   .");  
			System.out.println("5EXX11uUu12kFFUujJJuuuYYJPE5UMO;:@B@@@: ivSX7S0EkkL. r7vLLYP5uFquq22urvvi.,r7r777JjuFSjSUk1u1SPOZSPGMBZ1uvXOOZEOEOMFJP5555JJu5j2Xq1F8J   .");  
			System.out.println("E8PXNNZqX5F5X5F15UFXNSF1FFPkqXkL7uOM8qr:iiv7uXqXSjr  ;irr:uFFUXUX2: 7B@B@B@872Xk5Lj25SSLuUSUu2XNG1XZBMFv5EB@G50qGZNuSUuYuuYLFk2jXSjj0v   .");  
			System.out.println("GMPqPNNE00PNPEq0q0PqPqPP5XXqSFkPPuLJ7Lu1LYYL2ZqXuY7vii:7r  Y7u517::,.OB@B@M:  :J50ZO1U2uYuUULU2PZP1qMMPXk8qOq52SXk5SSkXFuuLYL1uuFPYUZL   .");  
			System.out.println("OM0XX5FU12XFSSqqEE0Xk5SSFSqSkXXkXqEk5ujY555SkkXvrrv777:,ri::viL1uLJ77iL5U7, :,iruF5kqkS2UjuuuuXPOX2FMOXF5JL7v7jPE255Pq0E0kSUuuuY1FjYEv   .");  
			System.out.println("ZMNNPNPqkXFF1F1SFSFXXNq0q8GqFPPq2uYuu15S5SkX1Ur::i:::iii:7;7;7rYkSuuujL777vYLu1k22L1FS2uu12S2121PkuSMMkBBMqLi7vFFSPk21uSP0qNXXXPqZS1G2   .");  
			System.out.println("GMEqPSPXNNENEq0q0FXPZPqXkkqF5SNqO8MMMZPFS1F2r::::::::..:rrir7;r,iuEkL7LLuUkFFUJLLUkkYv2SSjF5UJUuXXSSGZZZOB@MkJjJ11qXP51UXSXXqu22Skkq@2   .");  
			System.out.println("0MEZ0EPNPqqENEN0qZZZ0Eq0qqXqFFFXq0qZXk5S5FFr:M1::i::.iv,,iL7rJii,:rFE02LvJJYLj1kX05JvYvJ51u2juuSFFSqSJuquZZG1LuP0q55u2U5FqXNX1jJjjv2qL   .");  
			System.out.println("PEkSS5NN00GZ8ZGZGPXFkP0ZZ00qq1SFSFk15U1252j,7B@;:,,.uB@q ,Y7::7::..:ir0MO8ZE8G80NS1JuLjJ2FF5XSk151kXFv7XMEEPUYkqZEE0q1uY5XEZPkk5XS12GJ   .");  
			System.out.println("NMqP5F5SFS5XXXkXSqXkFPkPPNEG0PkN5S121PkkLvYi:2u;::.ijMM7 iJi,,irr;,rr,,vU2u51FU2JjJUujUFU12F1S1F5k1FSFv1XNXSU1XFuFSEZES12SXGkPFFSk2UEj   .");  
			System.out.println("OMqXENPkS11uUu1255kFXSXXPPEEZFXP55S2XNkvvrvriiii::iii:. ,ri,:::7F7:;v::ruu2jYLjJjvvvjjFkX5SFk5SFSFN5PSFu77LjkkSuU5S215SSkJLjXPqXXkXPBu   .");  
			System.out.println("OBXkXqkXFFS1j22FFF1F5kFUu55kSqXSSSFXOSr777r;:i::::::::..::,:::::vFv;ivL7;YjL7vvujuj2uFXZXXkXFkSXFqS05kuvjUjSqZqF5EFFSP25SFJv7j5X5FSkOU   .");  
			System.out.println("OBZXk1F1S112XFk5k151525U55SFXPk2X5XO5v7rrriii:i::::,::::ii::::i:.iFuvrvv7LUjUU2u15kkXFqPkFkkkSXSPS2SY7LFN5uj5PE515P5kPESFFX1uv1kFu258J   .");  
			System.out.println("GMSSSPP00NSF5kFS5kFXSkS0NE0GN0XF5q8Nr7rriri;ii:::::::::::i:i:i:i:,rXquL77JuU2kSX2Xk0qNXPFSkPFXkkk1UN1FFSJJUPFSP0XSSNuY5q1U2kFF2uYjYjXL   .");  
			System.out.println("5k52S122kPZqkFkFkSXP0NZNZqEN0PqFSOMr7rri;iiii:::::::::::::i:::::i::r5qXuLvvj2j1kXSkPGqqXqXPPqXXSX1XX1u1u1FP0qFSSqXNEXLJFq51u15u7LuSUEY   ."); 
			System.out.println("kZkPkSU1U55PPPXqXqPNPqXPkk5F11SEOBj77r;i:i:i:::i:::::::::i:::::ii;i::jPNuLv51uuF5XS0q0qqXPkqXqXqFSqFYuu25X55SP2jLu2PXSu5XSU2FSuL7j2S0j   .");  
			System.out.println("GOEq0q0XXFF1kPNXqXqPqXqqqPP5Nk0PB1r7rr;i:::::,ii:,:::,::::i:::iii:i:i:vU0PUJuj22F5kkqPP5XkEPESSXFPN5kFXXXkk5P55SkuSUkk5u121212F2uLJuNL   .");  
			System.out.println("NMXkSNXPXqPX5XP0qXkqP00GE8Z8G8GZGv7virii::::::i:::,:::,::::::iiii;i;iriivNN177u5155FFPXPk0NN0XSPkOZ8E8ZZNNqNqqPENqPEkF1XqP2NPS1FS1vJFL   .");  
			System.out.println("NZ1J2Fqk0qE0ZPXkXqNqE0Z0GEGEZE08Piv7r;rii:::::7:::,,:,..,:::::;iri;iri::ii1qqJLUF5SFXFPqG0ZXSPqFNqENq1X0NXPXNSSkX5qNESUuk55q0PPSPkXkMj   .");  
			System.out.println("ZMXSFNXXFPPEqNP008ZZEEN0qqXXFqPOLrvvrrii:::::;;:.::....::::::ii;irrrrr:i::;JqGS55kkqPqNZ0EqPSqXXPqXE0qXqXGENqqkNPkkFFqPF1XPk1SPEX52XOu   .");  
			System.out.println("8MEP0PF151kkNP0qEXXSXSkFXkPPNEOOLrv77ii:,.:.:i,.,::,..::i:iiiiii;;rr7iiir;rr1PqSFFXk0NEP0P0kPXXkqPESqNP1S08qZq8OEkqXXkEqXPq5F1XP0kSkMU   .");  
			System.out.println("0MXPXPkXSXFS21U1uUu1u2uFFXX0q88MU77vri:i,,. ,,.,::::,::ri::ii;ir;ri;rr;r;ri;75kX5kk0XE0ZNEqNkPXqk8OEP0P5uFXFU1SEENPE52F0Pqkk1kSXPPP0BF   .");  
			System.out.println("PqFU12XXqF22F21uU25U22SPPkXkFkNZX7777i::i:,.:::ii:::::i:::iiiiriiirr7;;irii;rJEPFSPPqP0qEqEPPX0kkqZqMM8qPPE0q2juk1SZGFuuSSk2U1522uU2GJ   .");  
			System.out.println("XZ15252SFS5kSXkqPNP0E8ZOZ0XPFk1kSSJLiii::i:::i::,::i:i:::iii;77ii7LJj1k8GPu7i7EZ1XPEXqXqq0PPP0PXkEXkPOG8ZZ0ZZO22SuLPEq2uuP0Xu55F11u2qu   .");  
			System.out.println("0GXSkFF25S0qNNGEGZ88O0q5kXqPPFkSFPOMMEqv7ri:iii:ir7;i:::iiri;rvLFkPULrLLJNMX7rZNSkNNN0ZNqXPq0qqkqEqkkSqPNXqPkNZXXq0XPXP51UFUFkPPPSkFOu   ."); 
			System.out.println("GBN0PN0ZE8E8880ZNEqPkXkqX0NZZGZMGqk0G@@@MNJ7v5XEGO8O0XFXqNX0N0qXkj7ri7rr77YOqYEE1XPEq0q0qENEqqXNNZNEqqXNPNP0Xkq01kPqNOGO0qS22XkNXk1kO2   .");  
			System.out.println("8O0qZ0Z0GNE00SSFPSkFkSqqqPNEGZZNOEX2LLkEMM@B@B@B@@@B@B@B@OZ0quLr7;77v777Lr72FjGqq0Z0EkqE8ZG00XkPZEEEZENqGZ8NZqPX00X5Sk00GGONPFkXqPqN@2   .");  
			System.out.println("XGFSkP5FFF5FFXkPPEN0qEqNq0PkFXSPSqkS5FuLLJUSPqujvv77riirrrr7r7vv7v777LvLvLvjYPNkX0q0XPqGGZqqPqFN0qXNq0XN0GZ8GGqqXqkPXP552FFPXXFkkEZE@1   .");  
			System.out.println("GMNXqSSSqqENZZOEG0ZEGEZqEqEq0P0PPkEP0N0k00N2Yrrii:ir77v7LLLvjLvvYvYLuuuuUj5U20E0ZXPP0G8ZGNNkqPFP80Z0ZEZqqFXkE0ZqPFkXNPqPPkS225FuUU518J   .");  
			System.out.println("EMPPXqPEEGZZ0Z00XXSkFFFPkXXNNE0Z0Z0EXPqZPP0OEZEEqPkFU2uuJJLYJJLuJuJu21uuU1FXEGGONEqZOM80kPqPPP1ZMBOMOOMB8ZPXSPNZ0EPNkSFq0OqSFNSF5S25Zj   .");  
			System.out.println("MB8E8GOEEkX5FFPPNP0PqkPXXFS55u11SSqF12XNOGOZ8ZOMMOOENXkSX15U5FkFkSkSS5XFS2PN8ZZPE0GZO0EqqP0kXSkqZq0NEqEGMMMGZqqk0Nq0EkSFEEq25SSU1SNq@U   .");  
			System.out.println("8@EE0E00qqXNN0qNNEEZEZ0Z0ENEPPkPSXXqXNNEZMBMG8EO8OZG8M8O8OOMO8EOZZq0qqXqX0Z8G80Z8OZZNNX0PqPPSkkqkSkNXPXqP0N0N88ZS5FPPNFSNGkUUXk1LLJUqL   .");  
			System.out.println("8OPFF1S5PXq0ZNqXkFkSPPq0E088OG8GG08GOOMO0PZMM8O8O8O0EZ8ZGXPSXSXXqqZNZ0ZZGGOGOOMOM8ZNGEZPXSNFPXSNME0XqqZ0ESF5NEG0P1525522qN0X0ENkXUYjPL   .");  
			System.out.println("0MPPFk5SFk5S552SFk5S1525U11XN8Z8Z8ZGEZ0EkSU5NMBM8MOMOO888GEG0ZEOGO8MGO8OOMMMMM8Mqq0ZGZqP5PSXkqFX0qkqqEXPEZqPPEN0q0FSSSFk2Uu11k21XNUuqJ   .");  
			System.out.println("EOE00NZPqSS55UUU55522ujL1SX1UuUU15F251522uv7XGOO@B@MBMBMMM@B@M@B@MMOMB@BBMMOOZZq0qZZ0kqkkFqPkF510P0qZZGkkqOG8Z8EEqq5qPGO8S12XXS1SFF5OJ   .");  
			System.out.println("O@88NE0ENEqNXXFkkk5kSPXENGqk1F11uUu2UUu11UJ5Z80GOMB@B@B@BBMBMBM@B@B@B@MBOOEZEZ0GZEPEPPXkSP0P5X2UqBZEEG8O00NZ8MOMG8NXSXPM8ZqqX0E8NX1NMU   .");  
			System.out.println("MBGN0XqPZZOG8ZZqZNEEGG8EEPPkqNZ0Z0qPqSS555NE8ZOZ88OMBB@BBB@B@B@B@B@BBOOOMOOZ8EEqNkEqqXNX0NP5kPkuFEO8EqEq00EP00GZZ0Ekk1P0G0ZNEPZGZP0q@u   .");  
			System.out.println("PZ5SSqP0NZEEq0N0q0qqXPkkk00OGOOM8O8O0P12j0GE080GZOO8GMM@B@B@B@B@MMGZEZEZEGZEqPkqX0N0PNkqNqFkFPSUJ20M8ENZNPPOEZEZqE88XSSEqPk0EZZ8q0N0BF   .");  
			System.out.println("GM0P0N0qNP0PqP0qZqE0ZEGE8EZ0NkPkk155u7L10ZZqZZGZO8M88Z8OBB@B@MOZZEEqEqNPNP0qZN0XPNEPqqPSNNkXkXSjUJuSMMOGOZGE8ZO0EPZGESXP0qqSkSE00q0PB1   .");  
			System.out.println("O@ZZN0P0qENZ0ZEGZEqEPqPPSXFSUuuUjJLJvY58EE0ZZOG88OGMOM88GOOMO8E8ZG0EqNN0NEZZq0EEk0NPq0SNqSX0kP1UuuLYJXG8GMOGPEZOO8PGE0NEq88O0kXEq0E8BX   .");  
		}
	}
}
