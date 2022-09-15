/*
 * Copyright (c) 2008 Roamware Inc.
 * All rights reserved
 */

package com.roamware.app.soraf.cache ;

import java.io.ByteArrayInputStream ;
import java.io.ByteArrayOutputStream ;
import java.util.Date ;
import java.util.Arrays;

import com.roamware.app.soraf.NetworkListObject ;
import com.roamware.sds2.fsmlib.cache.ICachable ;
import com.roamware.sds2.util.Logger ;

/**
 * This class serves as the data class for cache entries of
 * Subscriber Profile.
 * 
 * @author Somanath Jagadale
 *
 */
public class SubscriberProfileData implements ICachable
{
	//Field mark transient for couchbase. 
	protected transient long                  id ;
	//protected transient long				imsi ;
	protected transient java.util.Date		validitytime  ;

    protected int                           querystatus = 0; //0-Success, 1-Query SyncFail,3-Invalid Imsi

	private String                          __t = "SOR";
	protected String 						imsi;
	protected int							hnw;
	protected String						msisd;
	protected byte  						aRdcCk;
	protected int							gsmSts;
	protected int							gprsSts;
	protected int							gsmARc;
	protected double						ss7Txid;
	protected int							nVNwVlr;
	protected int							zFUlTyp;
	protected int							nZRnaUs;
	protected int							nGsmR;
	protected int							nGprsR;
	protected int							lGsmNw;
	protected int							lGprsNw;
	protected int							lGsmNSts;
	protected int							lGprsNSts;
	protected int							dRegSts;
	protected String						dRegMsc;
	protected String						dRegVlr;
	protected String						dRegSgsn;
	protected int							dRegNw;
	protected int							lTblZn;
	protected String						txnST;
	protected String						txnSD;
	protected int							msidnRT;
	protected int							lDRegT;
	protected int							tBLT;
	protected int							fRejT;
	protected int							dtBar;
	protected int							lULSrdcRT;
	protected byte  						arpE;
	protected String						nwType;
	protected String						msc;
	protected int							gprsARC;
	protected int							voicBar;
	protected int							lRegPep;
	protected String						imei;
	protected String						lang;
	protected int							servId;
	protected int							vendId;
	protected byte  						isWList;
	protected int							handId;
	protected int							simId;
	protected int							subCos;
	protected int							uSubCos;
	protected int							lRegNw;
	protected int							lNw;
	protected int							cRegNw;
	protected int							cRGsmNw;
	protected int							cRGprsNw;
	protected int							cNw;
	protected String						lRVlr;
	protected String						lRSgsn;
	protected String						cRVlr;
	protected String						cRSgsn;
	protected String						lVlr;
	protected String						lSgsn;
	protected String						cVlr;
	protected String						cSgsn;
	protected String						pRVlr;
	protected int							fATime;
	protected int							lGsmATime;
	protected int							lGprsATime;
	protected int							pMode;
	protected int							trStatus;
	protected int							useType;
	protected double						rejCount;
	protected int							accPSt;
	protected int							lTrTime;
	protected int							lMMTime;
	protected int							lPMMTime;
	protected int							lRZone;
	protected int							lRAppCos;
	protected int							lRTrMech;
	protected int							cRZone;
	protected int							cRAppCos;
	protected int							cRTrMech;
	protected int							sriACnt;
	protected byte  						pmsDel;
	protected int							pmmDcnt;
	protected int							tmmDCnt;
	protected int							pRStatus;
	protected int							dRnaClr;
	protected int							lRnaTime;
	protected int							sOtaReq;
	protected int							rnaClrZn;
	protected int							rnaClrCnt;
	protected int							nGsmNode;
	protected int							nGprsNode;
	protected int							nGsmNw;
	protected int							nGprsNw;
	protected int							lOtaQRTme;
	protected int							stFExpTme;
	protected int							stFRejCnt;
	protected int							ltFExpTme;
	protected int							ltFRejCnt;
	protected int							inGsmTme;
	protected int							inGprsTme;
	protected int							ss7PsiSts;
	protected int							nGsmGAtt;
	protected int							nGprsGAtt;
	protected int							nGsmNIN;
	protected int							nGprsNIN;
	protected int							lRegPZn;
	protected int							lRegPACos;
	protected int							lRgPTMch;
	protected int							cRegPZn;
	protected int							cRegPACos;
	protected int							cRgPTMch;
	protected byte  						cEvtArea;
	protected byte  						lEvtArea;
	protected int							ss7CLDTm;
	protected int							aULInfo;
	protected double						brgTxnId;
	protected int							bgsmStat;
	protected int							bgprsStat;
	protected String						lac;
	protected String						cellId;
	protected byte  						isHBlock;
	protected String						cellType;
	protected int							psiSts;
	protected int							clSts;
	protected int							srismSts;
	protected int							clDTime;
	protected int							noVVlr;
	protected int							bZFUlType;
	protected int							rtyLcCnt;
	protected int							brgMech;
	protected byte  						isAgrsve;
	protected int							fallBType;
	protected int							prevCMode;
	protected byte  						isApCCell;
	protected byte  						isFCExp;
	protected int							autoCMode;
	protected int							brgLTEsts;
	protected byte  						isForCell;
	protected int							blkType;
	protected int							bPhMode;
	protected int							brgSts;
	protected int							bPmDetCnt;
	protected int							bTmDetCnt;
	protected int							bLPmmTime;
	protected int							bFAttTime;
	protected int							lAttTime;
	protected String						bLVlr;
	protected String						bLSgsn;
	protected String						bCVlr;
	protected String						bCSgsn;
	protected int							bStFETime;
	protected int							bStFRCnt;
	protected int							bLtFETime;
	protected int							bLtFRCnt;
	protected String						brgLMme;
	protected String						brgCMme;
	protected int							bLLAppCos;
	protected int							lBrgARCde;
	protected int							bLTmmDCnt;
	protected String						pLocVlr;
	protected String						pLocLac;
	protected String						pLocCell;
	protected int							pLocNw;
	protected int							pLocType;
	protected int							bAReason;
	protected int							cLocPsiSt;
	protected byte  						msisdnP;
	protected int							opCode;
	protected int							status;
	protected String						instId;
	protected byte  						moveTMain;
	protected int							lUpdTime;
	protected int							lLdapQTme;
	protected int							lteSts;
	protected int							lteRsn;
	protected int							lteNRej;
	protected int							lteCRNwid;
	protected int							lLteNwid;
	protected int							nLteNodes;
	protected String						lMme;
	protected String						cMme;
	protected int							nLteNw;
	protected String						lRMme;
	protected int							lLAttTme;
	protected int							pRat;
	protected int							cRat;
	protected int							csfbFlg;
	protected String						rSesId;
	protected int							rAuthSts;
	protected int							lLappCos;
	protected String						cRMcc;
	protected String						cRMnc;
	protected String						dRMme;
	protected int							dLteRNw;
	protected int							idrSts;
	protected int							voiceRMsg;
	protected String						cRMmeRelm;
	protected String						cRMmeHst;
	protected int							lTTimeMse;
	protected int							lTmmDCnt;
	protected int							nLNInNw;
	protected String						rMme;
	protected int							odApCos;
	protected int							cInst;
	protected int							cRInst;
	protected String						vNwVlrLst;
	protected String						vVlrLst;
	protected String						cosList;
	protected int							volteSts;
	protected String						tVolteLst;
	protected String						actImsi;
	protected int							lVolteTrTm;
	protected int							rrStartTm;
	protected int							rrStatus;
	protected int    						lIMSAPNTm;
	protected String						cImei;
	protected int							pRTime;
	protected int							pRSts;
	protected String						rtrcosLst;


	protected boolean               datatype = true ;

	public final static int         C_IMSI             = 0 ;
	public final static int         C_HNW              = 1 ;
	public final static int         C_MSISD            = 2 ;
	public final static int         C_ARDCCK           = 3 ;
	public final static int         C_GSMSTS           = 4 ;
	public final static int         C_GPRSSTS          = 5 ;
	public final static int         C_GSMARC           = 6 ;
	public final static int         C_SS7TXID          = 7 ;
	public final static int         C_NVNWVLR          = 8 ;
	public final static int         C_ZFULTYP          = 9 ;
	public final static int         C_NZRNAUS          = 10 ;
	public final static int         C_NGSMR            = 11 ;
	public final static int         C_NGPRSR           = 12 ;
	public final static int         C_LGSMNW           = 13 ;
	public final static int         C_LGPRSNW          = 14 ;
	public final static int         C_LGSMNSTS         = 15 ;
	public final static int         C_LGPRSNSTS        = 16 ;
	public final static int         C_DREGSTS          = 17 ;
	public final static int         C_DREGMSC          = 18 ;
	public final static int         C_DREGVLR          = 19 ;
	public final static int         C_DREGSGSN         = 20 ;
	public final static int         C_DREGNW           = 21 ;
	public final static int         C_LTBLZN           = 22 ;
	public final static int         C_TXNST            = 23 ;
	public final static int         C_TXNSD            = 24 ;
	public final static int         C_MSIDNRT          = 25 ;
	public final static int         C_LDREGT           = 26 ;
	public final static int         C_TBLT             = 27 ;
	public final static int         C_FREJT            = 28 ;
	public final static int         C_DTBAR            = 29 ;
	public final static int         C_LULSRDCRT        = 30 ;
	public final static int         C_ARPE             = 31 ;
	public final static int         C_NWTYPE           = 32 ;
	public final static int         C_MSC              = 33 ;
	public final static int         C_GPRSARC          = 34 ;
	public final static int         C_VOICBAR          = 35 ;
	public final static int         C_LREGPEP          = 36 ;
	public final static int         C_IMEI             = 37 ;
	public final static int         C_LANG             = 38 ;
	public final static int         C_SERVID           = 39 ;
	public final static int         C_VENDID           = 40 ;
	public final static int         C_ISWLIST          = 41 ;
	public final static int         C_HANDID           = 42 ;
	public final static int         C_SIMID            = 43 ;
	public final static int         C_SUBCOS           = 44 ;
	public final static int         C_USUBCOS          = 45 ;
	public final static int         C_LREGNW           = 46 ;
	public final static int         C_LNW              = 47 ;
	public final static int         C_CREGNW           = 48 ;
	public final static int         C_CRGSMNW          = 49 ;
	public final static int         C_CRGPRSNW         = 50 ;
	public final static int         C_CNW              = 51 ;
	public final static int         C_LRVLR            = 52 ;
	public final static int         C_LRSGSN           = 53 ;
	public final static int         C_CRVLR            = 54 ;
	public final static int         C_CRSGSN           = 55 ;
	public final static int         C_LVLR             = 56 ;
	public final static int         C_LSGSN            = 57 ;
	public final static int         C_CVLR             = 58 ;
	public final static int         C_CSGSN            = 59 ;
	public final static int         C_PRVLR            = 60 ;
	public final static int         C_FATIME           = 61 ;
	public final static int         C_LGSMATIME        = 62 ;
	public final static int         C_LGPRSATIME       = 63 ;
	public final static int         C_PMODE            = 64 ;
	public final static int         C_TRSTATUS         = 65 ;
	public final static int         C_USETYPE          = 66 ;
	public final static int         C_REJCOUNT         = 67 ;
	public final static int         C_ACCPST           = 68 ;
	public final static int         C_LTRTIME          = 69 ;
	public final static int         C_LMMTIME          = 70 ;
	public final static int         C_LPMMTIME         = 71 ;
	public final static int         C_LRZONE           = 72 ;
	public final static int         C_LRAPPCOS         = 73 ;
	public final static int         C_LRTRMECH         = 74 ;
	public final static int         C_CRZONE           = 75 ;
	public final static int         C_CRAPPCOS         = 76 ;
	public final static int         C_CRTRMECH         = 77 ;
	public final static int         C_SRIACNT          = 78 ;
	public final static int         C_PMSDEL           = 79 ;
	public final static int         C_PMMDCNT          = 80 ;
	public final static int         C_TMMDCNT          = 81 ;
	public final static int         C_PRSTATUS         = 82 ;
	public final static int         C_DRNACLR          = 83 ;
	public final static int         C_LRNATIME         = 84 ;
	public final static int         C_SOTAREQ          = 85 ;
	public final static int         C_RNACLRZN         = 86 ;
	public final static int         C_RNACLRCNT        = 87 ;
	public final static int         C_NGSMNODE         = 88 ;
	public final static int         C_NGPRSNODE        = 89 ;
	public final static int         C_NGSMNW           = 90 ;
	public final static int         C_NGPRSNW          = 91 ;
	public final static int         C_LOTAQRTME        = 92 ;
	public final static int         C_STFEXPTME        = 93 ;
	public final static int         C_STFREJCNT        = 94 ;
	public final static int         C_LTFEXPTME        = 95 ;
	public final static int         C_LTFREJCNT        = 96 ;
	public final static int         C_INGSMTME         = 97 ;
	public final static int         C_INGPRSTME        = 98 ;
	public final static int         C_SS7PSISTS        = 99 ;
	public final static int         C_NGSMGATT         = 100 ;
	public final static int         C_NGPRSGATT        = 101 ;
	public final static int         C_NGSMNIN          = 102 ;
	public final static int         C_NGPRSNIN         = 103 ;
	public final static int         C_LREGPZN          = 104 ;
	public final static int         C_LREGPACOS        = 105 ;
	public final static int         C_LRGPTMCH         = 106 ;
	public final static int         C_CREGPZN          = 107 ;
	public final static int         C_CREGPACOS        = 108 ;
	public final static int         C_CRGPTMCH         = 109 ;
	public final static int         C_CEVTAREA         = 110 ;
	public final static int         C_LEVTAREA         = 111 ;
	public final static int         C_SS7CLDTM         = 112 ;
	public final static int         C_AULINFO          = 113 ;
	public final static int         C_BRGTXNID         = 114 ;
	public final static int         C_BGSMSTAT         = 115 ;
	public final static int         C_BGPRSSTAT        = 116 ;
	public final static int         C_LAC              = 117 ;
	public final static int         C_CELLID           = 118 ;
	public final static int         C_ISHBLOCK         = 119 ;
	public final static int         C_CELLTYPE         = 120 ;
	public final static int         C_PSISTS           = 121 ;
	public final static int         C_CLSTS            = 122 ;
	public final static int         C_SRISMSTS         = 123 ;
	public final static int         C_CLDTIME          = 124 ;
	public final static int         C_NOVVLR           = 125 ;
	public final static int         C_BZFULTYPE        = 126 ;
	public final static int         C_RTYLCCNT         = 127 ;
	public final static int         C_BRGMECH          = 128 ;
	public final static int         C_ISAGRSVE         = 129 ;
	public final static int         C_FALLBTYPE        = 130 ;
	public final static int         C_PREVCMODE        = 131 ;
	public final static int         C_ISAPCCELL        = 132 ;
	public final static int         C_ISFCEXP          = 133 ;
	public final static int         C_AUTOCMODE        = 134 ;
	public final static int         C_BRGLTESTS        = 135 ;
	public final static int         C_ISFORCELL        = 136 ;
	public final static int         C_BLKTYPE          = 137 ;
	public final static int         C_BPHMODE          = 138 ;
	public final static int         C_BRGSTS           = 139 ;
	public final static int         C_BPMDETCNT        = 140 ;
	public final static int         C_BTMDETCNT        = 141 ;
	public final static int         C_BLPMMTIME        = 142 ;
	public final static int         C_BFATTTIME        = 143 ;
	public final static int         C_LATTTIME         = 144 ;
	public final static int         C_BLVLR            = 145 ;
	public final static int         C_BLSGSN           = 146 ;
	public final static int         C_BCVLR            = 147 ;
	public final static int         C_BCSGSN           = 148 ;
	public final static int         C_BSTFETIME        = 149 ;
	public final static int         C_BSTFRCNT         = 150 ;
	public final static int         C_BLTFETIME        = 151 ;
	public final static int         C_BLTFRCNT         = 152 ;
	public final static int         C_BRGLMME          = 153 ;
	public final static int         C_BRGCMME          = 154 ;
	public final static int         C_BLLAPPCOS        = 155 ;
	public final static int         C_LBRGARCDE        = 156 ;
	public final static int         C_BLTMMDCNT        = 157 ;
	public final static int         C_PLOCVLR          = 158 ;
	public final static int         C_PLOCLAC          = 159 ;
	public final static int         C_PLOCCELL         = 160 ;
	public final static int         C_PLOCNW           = 161 ;
	public final static int         C_PLOCTYPE         = 162 ;
	public final static int         C_BAREASON         = 163 ;
	public final static int         C_CLOCPSIST        = 164 ;
	public final static int         C_MSISDNP          = 165 ;
	public final static int         C_OPCODE           = 166 ;
	public final static int         C_STATUS           = 167 ;
	public final static int         C_INSTID           = 168 ;
	public final static int         C_MOVETMAIN        = 169 ;
	public final static int         C_LUPDTIME         = 170 ;
	public final static int         C_LLDAPQTME        = 171 ;
	public final static int         C_LTESTS           = 172 ;
	public final static int         C_LTERSN           = 173 ;
	public final static int         C_LTENREJ          = 174 ;
	public final static int         C_LTECRNWID        = 175 ;
	public final static int         C_LLTENWID         = 176 ;
	public final static int         C_NLTENODES        = 177 ;
	public final static int         C_LMME             = 178 ;
	public final static int         C_CMME             = 179 ;
	public final static int         C_NLTENW           = 180 ;
	public final static int         C_LRMME            = 181 ;
	public final static int         C_LLATTTME         = 182 ;
	public final static int         C_PRAT             = 183 ;
	public final static int         C_CRAT             = 184 ;
	public final static int         C_CSFBFLG          = 185 ;
	public final static int         C_RSESID           = 186 ;
	public final static int         C_RAUTHSTS         = 187 ;
	public final static int         C_LLAPPCOS         = 188 ;
	public final static int         C_CRMCC            = 189 ;
	public final static int         C_CRMNC            = 190 ;
	public final static int         C_DRMME            = 191 ;
	public final static int         C_DLTERNW          = 192 ;
	public final static int         C_IDRSTS           = 193 ;
	public final static int         C_VOICERMSG        = 194 ;
	public final static int         C_CRMMERELM        = 195 ;
	public final static int         C_CRMMEHST         = 196 ;
	public final static int         C_LTTIMEMSE        = 197 ;
	public final static int         C_LTMMDCNT         = 198 ;
	public final static int         C_NLNINNW          = 199 ;
	public final static int         C_RMME             = 200 ;
	public final static int         C_ODAPCOS          = 201 ;
	public final static int         C_CINST            = 202 ;
	public final static int         C_CRINST           = 203 ;
	public final static int         C_VNWVLRLST        = 204 ;
	public final static int         C_VVLRLST          = 205 ;
	public final static int         C_COSLIST          = 206 ;
	public final static int         C_VOLTESTS         = 207 ;
	public final static int         C_TVOLTELST        = 208 ;
	public final static int         C_ACTIMSI          = 209 ;
	public final static int         C_LVOLTETRTM       = 210 ;
	public final static int         C_RRSTARTTM        = 211 ;
	public final static int         C_RRSTATUS         = 212 ;
	public final static int         C_LIMSAPNTM        = 213 ;
	public final static int         C_CIMEI            = 214 ;
	public final static int         C_PRTIME           = 215 ;
	public final static int         C_PRSTS            = 216 ;
	public final static int         C_RTRCOSLST        = 217 ;

	
	public static final String[] keys                   = {"imsi", "hnw", "msisd", "aRdcCk", "gsmSts", "gprsSts", "gsmARc", "ss7Txid", "nVNwVlr", "zFUlTyp", "nZRnaUs", "nGsmR", "nGprsR", "lGsmNw", "lGprsNw", "lGsmNSts", "lGprsNSts", "dRegSts", "dRegMsc", "dRegVlr", "dRegSgsn", "dRegNw", "lTblZn", "txnST", "txnSD", "msidnRT", "lDRegT", "tBLT", "fRejT", "dtBar", "lULSrdcRT", "arpE", "nwType", "msc", "gprsARC", "voicBar", "lRegPep", "imei", "lang", "servId", "vendId", "isWList", "handId", "simId", "subCos", "uSubCos", "lRegNw", "lNw", "cRegNw", "cRGsmNw", "cRGprsNw", "cNw", "lRVlr", "lRSgsn", "cRVlr", "cRSgsn", "lVlr", "lSgsn", "cVlr", "cSgsn", "pRVlr", "fATime", "lGsmATime", "lGprsATime", "pMode", "trStatus", "useType", "rejCount", "accPSt", "lTrTime", "lMMTime", "lPMMTime", "lRZone", "lRAppCos", "lRTrMech", "cRZone", "cRAppCos", "cRTrMech", "sriACnt", "pmsDel", "pmmDcnt", "tmmDCnt", "pRStatus", "dRnaClr", "lRnaTime", "sOtaReq", "rnaClrZn", "rnaClrCnt", "nGsmNode", "nGprsNode", "nGsmNw", "nGprsNw", "lOtaQRTme", "stFExpTme", "stFRejCnt", "ltFExpTme", "ltFRejCnt", "inGsmTme", "inGprsTme", "ss7PsiSts", "nGsmGAtt", "nGprsGAtt", "nGsmNIN", "nGprsNIN", "lRegPZn", "lRegPACos", "lRgPTMch", "cRegPZn", "cRegPACos", "cRgPTMch", "cEvtArea", "lEvtArea", "ss7CLDTm", "aULInfo", "brgTxnId", "bgsmStat", "bgprsStat", "lac", "cellId", "isHBlock", "cellType", "psiSts", "clSts", "srismSts", "clDTime", "noVVlr", "bZFUlType", "rtyLcCnt", "brgMech", "isAgrsve", "fallBType", "prevCMode", "isApCCell", "isFCExp", "autoCMode", "brgLTEsts", "isForCell", "blkType", "bPhMode", "brgSts", "bPmDetCnt", "bTmDetCnt", "bLPmmTime", "bFAttTime", "lAttTime", "bLVlr", "bLSgsn", "bCVlr", "bCSgsn", "bStFETime", "bStFRCnt", "bLtFETime", "bLtFRCnt", "brgLMme", "brgCMme", "bLLAppCos", "lBrgARCde", "bLTmmDCnt", "pLocVlr", "pLocLac", "pLocCell", "pLocNw", "pLocType", "bAReason", "cLocPsiSt", "msisdnP", "opCode", "status", "instId", "moveTMain", "lUpdTime", "lLdapQTme", "lteSts", "lteRsn", "lteNRej", "lteCRNwid", "lLteNwid", "nLteNodes", "lMme", "cMme", "nLteNw", "lRMme", "lLAttTme", "pRat", "cRat", "csfbFlg", "rSesId", "rAuthSts", "lLappCos", "cRMcc", "cRMnc", "dRMme", "dLteRNw", "idrSts", "voiceRMsg", "cRMmeRelm", "cRMmeHst", "lTTimeMse", "lTmmDCnt", "nLNInNw", "rMme", "odApCos", "cInst", "cRInst", "vNwVlrLst", "vVlrLst", "cosList", "volteSts", "tVolteLst", "actImsi", "lVolteTrTm", "rrStartTm", "rrStatus", "lIMSAPNTm", "cImei", "pRTime", "pRSts", "rtrcosLst"} ;

	public static final int[] indexes                   = {C_IMSI, C_HNW, C_MSISD, C_ARDCCK, C_GSMSTS, C_GPRSSTS, C_GSMARC, C_SS7TXID, C_NVNWVLR, C_ZFULTYP, C_NZRNAUS, C_NGSMR, C_NGPRSR, C_LGSMNW, C_LGPRSNW, C_LGSMNSTS, C_LGPRSNSTS, C_DREGSTS, C_DREGMSC, C_DREGVLR, C_DREGSGSN, C_DREGNW, C_LTBLZN, C_TXNST, C_TXNSD, C_MSIDNRT, C_LDREGT, C_TBLT, C_FREJT, C_DTBAR, C_LULSRDCRT, C_ARPE, C_NWTYPE, C_MSC, C_GPRSARC, C_VOICBAR, C_LREGPEP, C_IMEI, C_LANG, C_SERVID, C_VENDID, C_ISWLIST, C_HANDID, C_SIMID, C_SUBCOS, C_USUBCOS, C_LREGNW, C_LNW, C_CREGNW, C_CRGSMNW, C_CRGPRSNW, C_CNW, C_LRVLR, C_LRSGSN, C_CRVLR, C_CRSGSN, C_LVLR, C_LSGSN, C_CVLR, C_CSGSN, C_PRVLR, C_FATIME, C_LGSMATIME, C_LGPRSATIME, C_PMODE, C_TRSTATUS, C_USETYPE, C_REJCOUNT, C_ACCPST, C_LTRTIME, C_LMMTIME, C_LPMMTIME, C_LRZONE, C_LRAPPCOS, C_LRTRMECH, C_CRZONE, C_CRAPPCOS, C_CRTRMECH, C_SRIACNT, C_PMSDEL, C_PMMDCNT, C_TMMDCNT, C_PRSTATUS, C_DRNACLR, C_LRNATIME, C_SOTAREQ, C_RNACLRZN, C_RNACLRCNT, C_NGSMNODE, C_NGPRSNODE, C_NGSMNW, C_NGPRSNW, C_LOTAQRTME, C_STFEXPTME, C_STFREJCNT, C_LTFEXPTME, C_LTFREJCNT, C_INGSMTME, C_INGPRSTME, C_SS7PSISTS, C_NGSMGATT, C_NGPRSGATT, C_NGSMNIN, C_NGPRSNIN, C_LREGPZN, C_LREGPACOS, C_LRGPTMCH, C_CREGPZN, C_CREGPACOS, C_CRGPTMCH, C_CEVTAREA, C_LEVTAREA, C_SS7CLDTM, C_AULINFO, C_BRGTXNID, C_BGSMSTAT, C_BGPRSSTAT, C_LAC, C_CELLID, C_ISHBLOCK, C_CELLTYPE, C_PSISTS, C_CLSTS, C_SRISMSTS, C_CLDTIME, C_NOVVLR, C_BZFULTYPE, C_RTYLCCNT, C_BRGMECH, C_ISAGRSVE, C_FALLBTYPE, C_PREVCMODE, C_ISAPCCELL, C_ISFCEXP, C_AUTOCMODE, C_BRGLTESTS, C_ISFORCELL, C_BLKTYPE, C_BPHMODE, C_BRGSTS, C_BPMDETCNT, C_BTMDETCNT, C_BLPMMTIME, C_BFATTTIME, C_LATTTIME, C_BLVLR, C_BLSGSN, C_BCVLR, C_BCSGSN, C_BSTFETIME, C_BSTFRCNT, C_BLTFETIME, C_BLTFRCNT, C_BRGLMME, C_BRGCMME, C_BLLAPPCOS, C_LBRGARCDE, C_BLTMMDCNT, C_PLOCVLR, C_PLOCLAC, C_PLOCCELL, C_PLOCNW, C_PLOCTYPE, C_BAREASON, C_CLOCPSIST, C_MSISDNP, C_OPCODE, C_STATUS, C_INSTID, C_MOVETMAIN, C_LUPDTIME, C_LLDAPQTME, C_LTESTS, C_LTERSN, C_LTENREJ, C_LTECRNWID, C_LLTENWID, C_NLTENODES, C_LMME, C_CMME, C_NLTENW, C_LRMME, C_LLATTTME, C_PRAT, C_CRAT, C_CSFBFLG, C_RSESID, C_RAUTHSTS, C_LLAPPCOS, C_CRMCC, C_CRMNC, C_DRMME, C_DLTERNW, C_IDRSTS, C_VOICERMSG, C_CRMMERELM, C_CRMMEHST, C_LTTIMEMSE, C_LTMMDCNT, C_NLNINNW, C_RMME, C_ODAPCOS, C_CINST, C_CRINST, C_VNWVLRLST, C_VVLRLST, C_COSLIST, C_VOLTESTS, C_TVOLTELST, C_ACTIMSI, C_LVOLTETRTM, C_RRSTARTTM, C_RRSTATUS, C_LIMSAPNTM, C_CIMEI, C_PRTIME, C_PRSTS, C_RTRCOSLST} ;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public Object getKey()
	{
		return id ;
	}

	@Override
	public ICachable getDeepCopy()
	{
		SubscriberProfileData data = new SubscriberProfileData() ;
		Logger.getInstance().debug("Getting deep copy for loading in cache... ") ;
		return data ;
	}

	public int getQuerystatus() {
		return querystatus;
	}

	public void setQuerystatus(int querystatus) {
		this.querystatus = querystatus;
	}


	@Override
	public void serializeKey(ByteArrayOutputStream bos) throws Exception
	{
	}

	public void deserialize(ByteArrayInputStream bis) throws Exception
	{
	}

	public void serialize(ByteArrayOutputStream bos) throws Exception
	{
	}

	public void setDatatype(boolean datatype)
	{
		this.datatype = datatype ;
	}

	public String getImsi() 
	{
		return imsi;
	}

	public void setImsi(String imsi) 
	{
		this.imsi= imsi;
	}

	public String get__t() 
	{
		return __t;
	}

	public void set__t(String __t) 
	{
		this.__t = "SOR";
	}

	public int getCachingStatus()
	{
		return INSERTED ;
	}


	public String toString() { 
		return "";
	}

	//////////////////////////////
	/// generated getter and setters
	//////////////////////////////
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.util.Date getValiditytime() {
		return validitytime;
	}

	public void setValiditytime(java.util.Date validitytime) {
		this.validitytime = validitytime;
	}

	public int getHnw() {
		return hnw;
	}

	public void setHnw(int hnw) {
		this.hnw = hnw;
	}

	public String getMsisd() {
		return msisd;
	}

	public void setMsisd(String msisd) {
		this.msisd = msisd;
	}

	public byte getARdcCk() {
		return aRdcCk;
	}

	public void setARdcCk(byte aRdcCk) {
		this.aRdcCk = aRdcCk;
	}

	public int getGsmSts() {
		return gsmSts;
	}

	public void setGsmSts(int gsmSts) {
		this.gsmSts = gsmSts;
	}

	public int getGprsSts() {
		return gprsSts;
	}

	public void setGprsSts(int gprsSts) {
		this.gprsSts = gprsSts;
	}

	public int getGsmARc() {
		return gsmARc;
	}

	public void setGsmARc(int gsmARc) {
		this.gsmARc = gsmARc;
	}

	public double getSs7Txid() {
		return ss7Txid;
	}

	public void setSs7Txid(double ss7Txid) {
		this.ss7Txid = ss7Txid;
	}

	public int getNVNwVlr() {
		return nVNwVlr;
	}

	public void setNVNwVlr(int nVNwVlr) {
		this.nVNwVlr = nVNwVlr;
	}

	public int getZFUlTyp() {
		return zFUlTyp;
	}

	public void setZFUlTyp(int zFUlTyp) {
		this.zFUlTyp = zFUlTyp;
	}

	public int getNZRnaUs() {
		return nZRnaUs;
	}

	public void setNZRnaUs(int nZRnaUs) {
		this.nZRnaUs = nZRnaUs;
	}

	public int getNGsmR() {
		return nGsmR;
	}

	public void setNGsmR(int nGsmR) {
		this.nGsmR = nGsmR;
	}

	public int getNGprsR() {
		return nGprsR;
	}

	public void setNGprsR(int nGprsR) {
		this.nGprsR = nGprsR;
	}

	public int getLGsmNw() {
		return lGsmNw;
	}

	public void setLGsmNw(int lGsmNw) {
		this.lGsmNw = lGsmNw;
	}

	public int getLGprsNw() {
		return lGprsNw;
	}

	public void setLGprsNw(int lGprsNw) {
		this.lGprsNw = lGprsNw;
	}

	public int getLGsmNSts() {
		return lGsmNSts;
	}

	public void setLGsmNSts(int lGsmNSts) {
		this.lGsmNSts = lGsmNSts;
	}

	public int getLGprsNSts() {
		return lGprsNSts;
	}

	public void setLGprsNSts(int lGprsNSts) {
		this.lGprsNSts = lGprsNSts;
	}

	public int getDRegSts() {
		return dRegSts;
	}

	public void setDRegSts(int dRegSts) {
		this.dRegSts = dRegSts;
	}

	public String getDRegMsc() {
		return dRegMsc;
	}

	public void setDRegMsc(String dRegMsc) {
		this.dRegMsc = dRegMsc;
	}

	public String getDRegVlr() {
		return dRegVlr;
	}

	public void setDRegVlr(String dRegVlr) {
		this.dRegVlr = dRegVlr;
	}

	public String getDRegSgsn() {
		return dRegSgsn;
	}

	public void setDRegSgsn(String dRegSgsn) {
		this.dRegSgsn = dRegSgsn;
	}

	public int getDRegNw() {
		return dRegNw;
	}

	public void setDRegNw(int dRegNw) {
		this.dRegNw = dRegNw;
	}

	public int getLTblZn() {
		return lTblZn;
	}

	public void setLTblZn(int lTblZn) {
		this.lTblZn = lTblZn;
	}

	public String getTxnST() {
		return txnST;
	}

	public void setTxnST(String txnST) {
		this.txnST = txnST;
	}

	public String getTxnSD() {
		return txnSD;
	}

	public void setTxnSD(String txnSD) {
		this.txnSD = txnSD;
	}

	public int getMsidnRT() {
		return msidnRT;
	}

	public void setMsidnRT(int msidnRT) {
		this.msidnRT = msidnRT;
	}

	public int getLDRegT() {
		return lDRegT;
	}

	public void setLDRegT(int lDRegT) {
		this.lDRegT = lDRegT;
	}

	public int getTBLT() {
		return tBLT;
	}

	public void setTBLT(int tBLT) {
		this.tBLT = tBLT;
	}

	public int getFRejT() {
		return fRejT;
	}

	public void setFRejT(int fRejT) {
		this.fRejT = fRejT;
	}

	public int getDtBar() {
		return dtBar;
	}

	public void setDtBar(int dtBar) {
		this.dtBar = dtBar;
	}

	public int getLULSrdcRT() {
		return lULSrdcRT;
	}

	public void setLULSrdcRT(int lULSrdcRT) {
		this.lULSrdcRT = lULSrdcRT;
	}

	public byte   getArpE() {
		return arpE;
	}

	public void setArpE(byte   arpE) {
		this.arpE = arpE;
	}

	public String getNwType() {
		return nwType;
	}

	public void setNwType(String nwType) {
		this.nwType = nwType;
	}

	public String getMsc() {
		return msc;
	}

	public void setMsc(String msc) {
		this.msc = msc;
	}

	public int getGprsARC() {
		return gprsARC;
	}

	public void setGprsARC(int gprsARC) {
		this.gprsARC = gprsARC;
	}

	public int getVoicBar() {
		return voicBar;
	}

	public void setVoicBar(int voicBar) {
		this.voicBar = voicBar;
	}

	public int getLRegPep() {
		return lRegPep;
	}

	public void setLRegPep(int lRegPep) {
		this.lRegPep = lRegPep;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getServId() {
		return servId;
	}

	public void setServId(int servId) {
		this.servId = servId;
	}

	public int getVendId() {
		return vendId;
	}

	public void setVendId(int vendId) {
		this.vendId = vendId;
	}

	public byte   getIsWList() {
		return isWList;
	}

	public void setIsWList(byte   isWList) {
		this.isWList = isWList;
	}

	public int getHandId() {
		return handId;
	}

	public void setHandId(int handId) {
		this.handId = handId;
	}

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public int getSubCos() {
		return subCos;
	}

	public void setSubCos(int subCos) {
		this.subCos = subCos;
	}

	public int getUSubCos() {
		return uSubCos;
	}

	public void setUSubCos(int uSubCos) {
		this.uSubCos = uSubCos;
	}

	public int getLRegNw() {
		return lRegNw;
	}

	public void setLRegNw(int lRegNw) {
		this.lRegNw = lRegNw;
	}

	public int getLNw() {
		return lNw;
	}

	public void setLNw(int lNw) {
		this.lNw = lNw;
	}

	public int getCRegNw() {
		return cRegNw;
	}

	public void setCRegNw(int cRegNw) {
		this.cRegNw = cRegNw;
	}

	public int getCRGsmNw() {
		return cRGsmNw;
	}

	public void setCRGsmNw(int cRGsmNw) {
		this.cRGsmNw = cRGsmNw;
	}

	public int getCRGprsNw() {
		return cRGprsNw;
	}

	public void setCRGprsNw(int cRGprsNw) {
		this.cRGprsNw = cRGprsNw;
	}

	public int getCNw() {
		return cNw;
	}

	public void setCNw(int cNw) {
		this.cNw = cNw;
	}

	public String getLRVlr() {
		return lRVlr;
	}

	public void setLRVlr(String lRVlr) {
		this.lRVlr = lRVlr;
	}

	public String getLRSgsn() {
		return lRSgsn;
	}

	public void setLRSgsn(String lRSgsn) {
		this.lRSgsn = lRSgsn;
	}

	public String getCRVlr() {
		return cRVlr;
	}

	public void setCRVlr(String cRVlr) {
		this.cRVlr = cRVlr;
	}

	public String getCRSgsn() {
		return cRSgsn;
	}

	public void setCRSgsn(String cRSgsn) {
		this.cRSgsn = cRSgsn;
	}

	public String getLVlr() {
		return lVlr;
	}

	public void setLVlr(String lVlr) {
		this.lVlr = lVlr;
	}

	public String getLSgsn() {
		return lSgsn;
	}

	public void setLSgsn(String lSgsn) {
		this.lSgsn = lSgsn;
	}

	public String getCVlr() {
		return cVlr;
	}

	public void setCVlr(String cVlr) {
		this.cVlr = cVlr;
	}

	public String getCSgsn() {
		return cSgsn;
	}

	public void setCSgsn(String cSgsn) {
		this.cSgsn = cSgsn;
	}

	public String getPRVlr() {
		return pRVlr;
	}

	public void setPRVlr(String pRVlr) {
		this.pRVlr = pRVlr;
	}

	public int getFATime() {
		return fATime;
	}

	public void setFATime(int fATime) {
		this.fATime = fATime;
	}

	public int getLGsmATime() {
		return lGsmATime;
	}

	public void setLGsmATime(int lGsmATime) {
		this.lGsmATime = lGsmATime;
	}

	public int getLGprsATime() {
		return lGprsATime;
	}

	public void setLGprsATime(int lGprsATime) {
		this.lGprsATime = lGprsATime;
	}

	public int getPMode() {
		return pMode;
	}

	public void setPMode(int pMode) {
		this.pMode = pMode;
	}

	public int getTrStatus() {
		return trStatus;
	}

	public void setTrStatus(int trStatus) {
		this.trStatus = trStatus;
	}

	public int getUseType() {
		return useType;
	}

	public void setUseType(int useType) {
		this.useType = useType;
	}

	public double getRejCount() {
		return rejCount;
	}

	public void setRejCount(double rejCount) {
		this.rejCount = rejCount;
	}

	public int getAccPSt() {
		return accPSt;
	}

	public void setAccPSt(int accPSt) {
		this.accPSt = accPSt;
	}

	public int getLTrTime() {
		return lTrTime;
	}

	public void setLTrTime(int lTrTime) {
		this.lTrTime = lTrTime;
	}

	public int getLMMTime() {
		return lMMTime;
	}

	public void setLMMTime(int lMMTime) {
		this.lMMTime = lMMTime;
	}

	public int getLPMMTime() {
		return lPMMTime;
	}

	public void setLPMMTime(int lPMMTime) {
		this.lPMMTime = lPMMTime;
	}

	public int getLRZone() {
		return lRZone;
	}

	public void setLRZone(int lRZone) {
		this.lRZone = lRZone;
	}

	public int getLRAppCos() {
		return lRAppCos;
	}

	public void setLRAppCos(int lRAppCos) {
		this.lRAppCos = lRAppCos;
	}

	public int getLRTrMech() {
		return lRTrMech;
	}

	public void setLRTrMech(int lRTrMech) {
		this.lRTrMech = lRTrMech;
	}

	public int getCRZone() {
		return cRZone;
	}

	public void setCRZone(int cRZone) {
		this.cRZone = cRZone;
	}

	public int getCRAppCos() {
		return cRAppCos;
	}

	public void setCRAppCos(int cRAppCos) {
		this.cRAppCos = cRAppCos;
	}

	public int getCRTrMech() {
		return cRTrMech;
	}

	public void setCRTrMech(int cRTrMech) {
		this.cRTrMech = cRTrMech;
	}

	public int getSriACnt() {
		return sriACnt;
	}

	public void setSriACnt(int sriACnt) {
		this.sriACnt = sriACnt;
	}

	public byte   getPmsDel() {
		return pmsDel;
	}

	public void setPmsDel(byte   pmsDel) {
		this.pmsDel = pmsDel;
	}

	public int getPmmDcnt() {
		return pmmDcnt;
	}

	public void setPmmDcnt(int pmmDcnt) {
		this.pmmDcnt = pmmDcnt;
	}

	public int getTmmDCnt() {
		return tmmDCnt;
	}

	public void setTmmDCnt(int tmmDCnt) {
		this.tmmDCnt = tmmDCnt;
	}

	public int getPRStatus() {
		return pRStatus;
	}

	public void setPRStatus(int pRStatus) {
		this.pRStatus = pRStatus;
	}

	public int getDRnaClr() {
		return dRnaClr;
	}

	public void setDRnaClr(int dRnaClr) {
		this.dRnaClr = dRnaClr;
	}

	public int getLRnaTime() {
		return lRnaTime;
	}

	public void setLRnaTime(int lRnaTime) {
		this.lRnaTime = lRnaTime;
	}

	public int getSOtaReq() {
		return sOtaReq;
	}

	public void setSOtaReq(int sOtaReq) {
		this.sOtaReq = sOtaReq;
	}

	public int getRnaClrZn() {
		return rnaClrZn;
	}

	public void setRnaClrZn(int rnaClrZn) {
		this.rnaClrZn = rnaClrZn;
	}

	public int getRnaClrCnt() {
		return rnaClrCnt;
	}

	public void setRnaClrCnt(int rnaClrCnt) {
		this.rnaClrCnt = rnaClrCnt;
	}

	public int getNGsmNode() {
		return nGsmNode;
	}

	public void setNGsmNode(int nGsmNode) {
		this.nGsmNode = nGsmNode;
	}

	public int getNGprsNode() {
		return nGprsNode;
	}

	public void setNGprsNode(int nGprsNode) {
		this.nGprsNode = nGprsNode;
	}

	public int getNGsmNw() {
		return nGsmNw;
	}

	public void setNGsmNw(int nGsmNw) {
		this.nGsmNw = nGsmNw;
	}

	public int getNGprsNw() {
		return nGprsNw;
	}

	public void setNGprsNw(int nGprsNw) {
		this.nGprsNw = nGprsNw;
	}

	public int getLOtaQRTme() {
		return lOtaQRTme;
	}

	public void setLOtaQRTme(int lOtaQRTme) {
		this.lOtaQRTme = lOtaQRTme;
	}

	public int getStFExpTme() {
		return stFExpTme;
	}

	public void setStFExpTme(int stFExpTme) {
		this.stFExpTme = stFExpTme;
	}

	public int getStFRejCnt() {
		return stFRejCnt;
	}

	public void setStFRejCnt(int stFRejCnt) {
		this.stFRejCnt = stFRejCnt;
	}

	public int getLtFExpTme() {
		return ltFExpTme;
	}

	public void setLtFExpTme(int ltFExpTme) {
		this.ltFExpTme = ltFExpTme;
	}

	public int getLtFRejCnt() {
		return ltFRejCnt;
	}

	public void setLtFRejCnt(int ltFRejCnt) {
		this.ltFRejCnt = ltFRejCnt;
	}

	public int getInGsmTme() {
		return inGsmTme;
	}

	public void setInGsmTme(int inGsmTme) {
		this.inGsmTme = inGsmTme;
	}

	public int getInGprsTme() {
		return inGprsTme;
	}

	public void setInGprsTme(int inGprsTme) {
		this.inGprsTme = inGprsTme;
	}

	public int getSs7PsiSts() {
		return ss7PsiSts;
	}

	public void setSs7PsiSts(int ss7PsiSts) {
		this.ss7PsiSts = ss7PsiSts;
	}

	public int getNGsmGAtt() {
		return nGsmGAtt;
	}

	public void setNGsmGAtt(int nGsmGAtt) {
		this.nGsmGAtt = nGsmGAtt;
	}

	public int getNGprsGAtt() {
		return nGprsGAtt;
	}

	public void setNGprsGAtt(int nGprsGAtt) {
		this.nGprsGAtt = nGprsGAtt;
	}

	public int getNGsmNIN() {
		return nGsmNIN;
	}

	public void setNGsmNIN(int nGsmNIN) {
		this.nGsmNIN = nGsmNIN;
	}

	public int getNGprsNIN() {
		return nGprsNIN;
	}

	public void setNGprsNIN(int nGprsNIN) {
		this.nGprsNIN = nGprsNIN;
	}

	public int getLRegPZn() {
		return lRegPZn;
	}

	public void setLRegPZn(int lRegPZn) {
		this.lRegPZn = lRegPZn;
	}

	public int getLRegPACos() {
		return lRegPACos;
	}

	public void setLRegPACos(int lRegPACos) {
		this.lRegPACos = lRegPACos;
	}

	public int getLRgPTMch() {
		return lRgPTMch;
	}

	public void setLRgPTMch(int lRgPTMch) {
		this.lRgPTMch = lRgPTMch;
	}

	public int getCRegPZn() {
		return cRegPZn;
	}

	public void setCRegPZn(int cRegPZn) {
		this.cRegPZn = cRegPZn;
	}

	public int getCRegPACos() {
		return cRegPACos;
	}

	public void setCRegPACos(int cRegPACos) {
		this.cRegPACos = cRegPACos;
	}

	public int getCRgPTMch() {
		return cRgPTMch;
	}

	public void setCRgPTMch(int cRgPTMch) {
		this.cRgPTMch = cRgPTMch;
	}

	public byte   getCEvtArea() {
		return cEvtArea;
	}

	public void setCEvtArea(byte   cEvtArea) {
		this.cEvtArea = cEvtArea;
	}

	public byte   getLEvtArea() {
		return lEvtArea;
	}

	public void setLEvtArea(byte   lEvtArea) {
		this.lEvtArea = lEvtArea;
	}

	public int getSs7CLDTm() {
		return ss7CLDTm;
	}

	public void setSs7CLDTm(int ss7CLDTm) {
		this.ss7CLDTm = ss7CLDTm;
	}

	public int getAULInfo() {
		return aULInfo;
	}

	public void setAULInfo(int aULInfo) {
		this.aULInfo = aULInfo;
	}

	public double getBrgTxnId() {
		return brgTxnId;
	}

	public void setBrgTxnId(double brgTxnId) {
		this.brgTxnId = brgTxnId;
	}

	public int getBgsmStat() {
		return bgsmStat;
	}

	public void setBgsmStat(int bgsmStat) {
		this.bgsmStat = bgsmStat;
	}

	public int getBgprsStat() {
		return bgprsStat;
	}

	public void setBgprsStat(int bgprsStat) {
		this.bgprsStat = bgprsStat;
	}

	public String getLac() {
		return lac;
	}

	public void setLac(String lac) {
		this.lac = lac;
	}

	public String getCellId() {
		return cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public byte   getIsHBlock() {
		return isHBlock;
	}

	public void setIsHBlock(byte   isHBlock) {
		this.isHBlock = isHBlock;
	}

	public String getCellType() {
		return cellType;
	}

	public void setCellType(String cellType) {
		this.cellType = cellType;
	}

	public int getPsiSts() {
		return psiSts;
	}

	public void setPsiSts(int psiSts) {
		this.psiSts = psiSts;
	}

	public int getClSts() {
		return clSts;
	}

	public void setClSts(int clSts) {
		this.clSts = clSts;
	}

	public int getSrismSts() {
		return srismSts;
	}

	public void setSrismSts(int srismSts) {
		this.srismSts = srismSts;
	}

	public int getClDTime() {
		return clDTime;
	}

	public void setClDTime(int clDTime) {
		this.clDTime = clDTime;
	}

	public int getNoVVlr() {
		return noVVlr;
	}

	public void setNoVVlr(int noVVlr) {
		this.noVVlr = noVVlr;
	}

	public int getBZFUlType() {
		return bZFUlType;
	}

	public void setBZFUlType(int bZFUlType) {
		this.bZFUlType = bZFUlType;
	}

	public int getRtyLcCnt() {
		return rtyLcCnt;
	}

	public void setRtyLcCnt(int rtyLcCnt) {
		this.rtyLcCnt = rtyLcCnt;
	}

	public int getBrgMech() {
		return brgMech;
	}

	public void setBrgMech(int brgMech) {
		this.brgMech = brgMech;
	}

	public byte getIsAgrsve() {
		return isAgrsve;
	}

	public void setIsAgrsve(byte isAgrsve) {
		this.isAgrsve = isAgrsve;
	}

	public int getFallBType() {
		return fallBType;
	}

	public void setFallBType(int fallBType) {
		this.fallBType = fallBType;
	}

	public int getPrevCMode() {
		return prevCMode;
	}

	public void setPrevCMode(int prevCMode) {
		this.prevCMode = prevCMode;
	}

	public byte   getIsApCCell() {
		return isApCCell;
	}

	public void setIsApCCell(byte   isApCCell) {
		this.isApCCell = isApCCell;
	}

	public byte   getIsFCExp() {
		return isFCExp;
	}

	public void setIsFCExp(byte   isFCExp) {
		this.isFCExp = isFCExp;
	}

	public int getAutoCMode() {
		return autoCMode;
	}

	public void setAutoCMode(int autoCMode) {
		this.autoCMode = autoCMode;
	}

	public int getBrgLTEsts() {
		return brgLTEsts;
	}

	public void setBrgLTEsts(int brgLTEsts) {
		this.brgLTEsts = brgLTEsts;
	}

	public byte   getIsForCell() {
		return isForCell;
	}

	public void setIsForCell(byte   isForCell) {
		this.isForCell = isForCell;
	}

	public int getBlkType() {
		return blkType;
	}

	public void setBlkType(int blkType) {
		this.blkType = blkType;
	}

	public int getBPhMode() {
		return bPhMode;
	}

	public void setBPhMode(int bPhMode) {
		this.bPhMode = bPhMode;
	}

	public int getBrgSts() {
		return brgSts;
	}

	public void setBrgSts(int brgSts) {
		this.brgSts = brgSts;
	}

	public int getBPmDetCnt() {
		return bPmDetCnt;
	}

	public void setBPmDetCnt(int bPmDetCnt) {
		this.bPmDetCnt = bPmDetCnt;
	}

	public int getBTmDetCnt() {
		return bTmDetCnt;
	}

	public void setBTmDetCnt(int bTmDetCnt) {
		this.bTmDetCnt = bTmDetCnt;
	}

	public int getBLPmmTime() {
		return bLPmmTime;
	}

	public void setBLPmmTime(int bLPmmTime) {
		this.bLPmmTime = bLPmmTime;
	}

	public int getBFAttTime() {
		return bFAttTime;
	}

	public void setBFAttTime(int bFAttTime) {
		this.bFAttTime = bFAttTime;
	}

	public int getLAttTime() {
		return lAttTime;
	}

	public void setLAttTime(int lAttTime) {
		this.lAttTime = lAttTime;
	}

	public String getBLVlr() {
		return bLVlr;
	}

	public void setBLVlr(String bLVlr) {
		this.bLVlr = bLVlr;
	}

	public String getBLSgsn() {
		return bLSgsn;
	}

	public void setBLSgsn(String bLSgsn) {
		this.bLSgsn = bLSgsn;
	}

	public String getBCVlr() {
		return bCVlr;
	}

	public void setBCVlr(String bCVlr) {
		this.bCVlr = bCVlr;
	}

	public String getBCSgsn() {
		return bCSgsn;
	}

	public void setBCSgsn(String bCSgsn) {
		this.bCSgsn = bCSgsn;
	}

	public int getBStFETime() {
		return bStFETime;
	}

	public void setBStFETime(int bStFETime) {
		this.bStFETime = bStFETime;
	}

	public int getBStFRCnt() {
		return bStFRCnt;
	}

	public void setBStFRCnt(int bStFRCnt) {
		this.bStFRCnt = bStFRCnt;
	}

	public int getBLtFETime() {
		return bLtFETime;
	}

	public void setBLtFETime(int bLtFETime) {
		this.bLtFETime = bLtFETime;
	}

	public int getBLtFRCnt() {
		return bLtFRCnt;
	}

	public void setBLtFRCnt(int bLtFRCnt) {
		this.bLtFRCnt = bLtFRCnt;
	}

	public String getBrgLMme() {
		return brgLMme;
	}

	public void setBrgLMme(String brgLMme) {
		this.brgLMme = brgLMme;
	}

	public String getBrgCMme() {
		return brgCMme;
	}

	public void setBrgCMme(String brgCMme) {
		this.brgCMme = brgCMme;
	}

	public int getBLLAppCos() {
		return bLLAppCos;
	}

	public void setBLLAppCos(int bLLAppCos) {
		this.bLLAppCos = bLLAppCos;
	}

	public int getLBrgARCde() {
		return lBrgARCde;
	}

	public void setLBrgARCde(int lBrgARCde) {
		this.lBrgARCde = lBrgARCde;
	}

	public int getBLTmmDCnt() {
		return bLTmmDCnt;
	}

	public void setBLTmmDCnt(int bLTmmDCnt) {
		this.bLTmmDCnt = bLTmmDCnt;
	}

	public String getPLocVlr() {
		return pLocVlr;
	}

	public void setPLocVlr(String pLocVlr) {
		this.pLocVlr = pLocVlr;
	}

	public String getPLocLac() {
		return pLocLac;
	}

	public void setPLocLac(String pLocLac) {
		this.pLocLac = pLocLac;
	}

	public String getPLocCell() {
		return pLocCell;
	}

	public void setPLocCell(String pLocCell) {
		this.pLocCell = pLocCell;
	}

	public int getPLocNw() {
		return pLocNw;
	}

	public void setPLocNw(int pLocNw) {
		this.pLocNw = pLocNw;
	}

	public int getPLocType() {
		return pLocType;
	}

	public void setPLocType(int pLocType) {
		this.pLocType = pLocType;
	}

	public int getBAReason() {
		return bAReason;
	}

	public void setBAReason(int bAReason) {
		this.bAReason = bAReason;
	}

	public int getCLocPsiSt() {
		return cLocPsiSt;
	}

	public void setCLocPsiSt(int cLocPsiSt) {
		this.cLocPsiSt = cLocPsiSt;
	}

	public byte   getMsisdnP() {
		return msisdnP;
	}

	public void setMsisdnP(byte   msisdnP) {
		this.msisdnP = msisdnP;
	}

	public int getOpCode() {
		return opCode;
	}

	public void setOpCode(int opCode) {
		this.opCode = opCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public byte getMoveTMain() {
		return moveTMain;
	}

	public void setMoveTMain(byte moveTMain) {
		this.moveTMain = moveTMain;
	}

	public int getLUpdTime() {
		return lUpdTime;
	}

	public void setLUpdTime(int lUpdTime) {
		this.lUpdTime = lUpdTime;
	}

	public int getLLdapQTme() {
		return lLdapQTme;
	}

	public void setLLdapQTme(int lLdapQTme) {
		this.lLdapQTme = lLdapQTme;
	}

	public int getLteSts() {
		return lteSts;
	}

	public void setLteSts(int lteSts) {
		this.lteSts = lteSts;
	}

	public int getLteRsn() {
		return lteRsn;
	}

	public void setLteRsn(int lteRsn) {
		this.lteRsn = lteRsn;
	}

	public int getLteNRej() {
		return lteNRej;
	}

	public void setLteNRej(int lteNRej) {
		this.lteNRej = lteNRej;
	}

	public int getLteCRNwid() {
		return lteCRNwid;
	}

	public void setLteCRNwid(int lteCRNwid) {
		this.lteCRNwid = lteCRNwid;
	}

	public int getLLteNwid() {
		return lLteNwid;
	}

	public void setLLteNwid(int lLteNwid) {
		this.lLteNwid = lLteNwid;
	}

	public int getNLteNodes() {
		return nLteNodes;
	}

	public void setNLteNodes(int nLteNodes) {
		this.nLteNodes = nLteNodes;
	}

	public String getLMme() {
		return lMme;
	}

	public void setLMme(String lMme) {
		this.lMme = lMme;
	}

	public String getCMme() {
		return cMme;
	}

	public void setCMme(String cMme) {
		this.cMme = cMme;
	}

	public int getNLteNw() {
		return nLteNw;
	}

	public void setNLteNw(int nLteNw) {
		this.nLteNw = nLteNw;
	}

	public String getLRMme() {
		return lRMme;
	}

	public void setLRMme(String lRMme) {
		this.lRMme = lRMme;
	}

	public int getLLAttTme() {
		return lLAttTme;
	}

	public void setLLAttTme(int lLAttTme) {
		this.lLAttTme = lLAttTme;
	}

	public int getPRat() {
		return pRat;
	}

	public void setPRat(int pRat) {
		this.pRat = pRat;
	}

	public int getCRat() {
		return cRat;
	}

	public void setCRat(int cRat) {
		this.cRat = cRat;
	}

	public int getCsfbFlg() {
		return csfbFlg;
	}

	public void setCsfbFlg(int csfbFlg) {
		this.csfbFlg = csfbFlg;
	}

	public String getRSesId() {
		return rSesId;
	}

	public void setRSesId(String rSesId) {
		this.rSesId = rSesId;
	}

	public int getRAuthSts() {
		return rAuthSts;
	}

	public void setRAuthSts(int rAuthSts) {
		this.rAuthSts = rAuthSts;
	}

	public int getLLappCos() {
		return lLappCos;
	}

	public void setLLappCos(int lLappCos) {
		this.lLappCos = lLappCos;
	}

	public String getCRMcc() {
		return cRMcc;
	}

	public void setCRMcc(String cRMcc) {
		this.cRMcc = cRMcc;
	}

	public String getCRMnc() {
		return cRMnc;
	}

	public void setCRMnc(String cRMnc) {
		this.cRMnc = cRMnc;
	}

	public String getDRMme() {
		return dRMme;
	}

	public void setDRMme(String dRMme) {
		this.dRMme = dRMme;
	}

	public int getDLteRNw() {
		return dLteRNw;
	}

	public void setDLteRNw(int dLteRNw) {
		this.dLteRNw = dLteRNw;
	}

	public int getIdrSts() {
		return idrSts;
	}

	public void setIdrSts(int idrSts) {
		this.idrSts = idrSts;
	}

	public int getVoiceRMsg() {
		return voiceRMsg;
	}

	public void setVoiceRMsg(int voiceRMsg) {
		this.voiceRMsg = voiceRMsg;
	}

	public String getCRMmeRelm() {
		return cRMmeRelm;
	}

	public void setCRMmeRelm(String cRMmeRelm) {
		this.cRMmeRelm = cRMmeRelm;
	}

	public String getCRMmeHst() {
		return cRMmeHst;
	}

	public void setCRMmeHst(String cRMmeHst) {
		this.cRMmeHst = cRMmeHst;
	}

	public int getLTTimeMse() {
		return lTTimeMse;
	}

	public void setLTTimeMse(int lTTimeMse) {
		this.lTTimeMse = lTTimeMse;
	}

	public int getLTmmDCnt() {
		return lTmmDCnt;
	}

	public void setLTmmDCnt(int lTmmDCnt) {
		this.lTmmDCnt = lTmmDCnt;
	}

	public int getNLNInNw() {
		return nLNInNw;
	}

	public void setNLNInNw(int nLNInNw) {
		this.nLNInNw = nLNInNw;
	}

	public String getRMme() {
		return rMme;
	}

	public void setRMme(String rMme) {
		this.rMme = rMme;
	}

	public int getOdApCos() {
		return odApCos;
	}

	public void setOdApCos(int odApCos) {
		this.odApCos = odApCos;
	}

	public int getCInst() {
		return cInst;
	}

	public void setCInst(int cInst) {
		this.cInst = cInst;
	}

	public int getCRInst() {
		return cRInst;
	}

	public void setCRInst(int cRInst) {
		this.cRInst = cRInst;
	}

	public String getVNwVlrLst() {
		return vNwVlrLst;
	}

	public void setVNwVlrLst(String vNwVlrLst) {
		this.vNwVlrLst = vNwVlrLst;
	}

	public String getVVlrLst() {
		return vVlrLst;
	}

	public void setVVlrLst(String vVlrLst) {
		this.vVlrLst = vVlrLst;
	}

	public String getCosList() {
		return cosList;
	}

	public void setCosList(String cosList) {
		this.cosList = cosList;
	}

	public int getVolteSts() {
		return volteSts;
	}

	public void setVolteSts(int volteSts) {
		this.volteSts = volteSts;
	}

	public String getTVolteLst() {
		return tVolteLst;
	}

	public void setTVolteLst(String tVolteLst) {
		this.tVolteLst = tVolteLst;
	}

	public String getActImsi() {
		return actImsi;
	}

	public void setActImsi(String actImsi) {
		this.actImsi = actImsi;
	}

	public int getLVolteTrTm() {
		return lVolteTrTm;
	}

	public void setLVolteTrTm(int lVolteTrTm) {
		this.lVolteTrTm = lVolteTrTm;
	}

	public int getRrStartTm() {
		return rrStartTm;
	}

	public void setRrStartTm(int rrStartTm) {
		this.rrStartTm = rrStartTm;
	}

	public int getRrStatus() {
		return rrStatus;
	}

	public void setRrStatus(int rrStatus) {
		this.rrStatus = rrStatus;
	}

	public int getLIMSAPNTm() {
		return lIMSAPNTm;
	}

	public void setLIMSAPNTm(int lIMSAPNTm) {
		this.lIMSAPNTm = lIMSAPNTm;
	}

	public String getCImei() {
		return cImei;
	}

	public void setCImei(String cImei) {
		this.cImei = cImei;
	}

	public int getPRTime() {
		return pRTime;
	}

	public void setPRTime(int pRTime) {
		this.pRTime = pRTime;
	}

	public int getPRSts() {
		return pRSts;
	}

	public void setPRSts(int pRSts) {
		this.pRSts = pRSts;
	}

	public String getRtrcosLst() {
		return rtrcosLst;
	}

	public void setRtrcosLst(String rtrcosLst) {
		this.rtrcosLst = rtrcosLst;
	}

	public boolean getDatatype() {
		return datatype;
	}

	public SubscriberProfileData(){

		status = 0 ;
		querystatus = 0 ;
		imsi = "0" ;
		__t = "SOR" ;
		hnw = -1 ;
		msisd = "0" ;
		aRdcCk = 0 ;
		gsmSts = 3 ;
		gprsSts = 3 ;
		gsmARc = 0 ;
		ss7Txid = -1 ;
		nVNwVlr = 0 ;
		zFUlTyp = -1 ;
		nZRnaUs = 0 ;
		nGsmR = 0 ;
		nGprsR = 0 ;
		lGsmNw = -1 ;
		lGprsNw = -1 ;
		lGsmNSts = 0 ;
		lGprsNSts = 0 ;
		dRegSts = 0 ;
		dRegMsc = "0" ;
		dRegVlr = "0" ;
		dRegSgsn = "0" ;
		dRegNw = -1 ;
		lTblZn = -1 ;
		txnST = "0" ;
		txnSD = "0" ;
		msidnRT = 0 ;
		lDRegT = 0 ;
		tBLT = 0 ;
		fRejT = 0 ;
		dtBar = 0 ;
		lULSrdcRT = 0 ;
		arpE = 0 ;
		msc = "0" ;
		gprsARC = 0 ;
		voicBar = 0 ;
		lRegPep = 0 ;
		imei = "0" ;
		lang = "0" ;
		servId = -1 ;
		vendId = -1 ;
		isWList = 0 ;
		handId = -1 ;
		simId = -1 ;
		subCos = 0 ;
		uSubCos = -1 ;
		lRegNw = -1 ;
		lNw = -1 ;
		cRegNw = -1 ;
		cRGsmNw = -1 ;
		cRGprsNw = -1 ;
		cNw = -1 ;
		lRVlr = "0" ;
		lRSgsn = "0" ;
		cRVlr = "0" ;
		cRSgsn = "0" ;
		lVlr = "0" ;
		lSgsn = "0" ;
		cVlr = "0" ;
		cSgsn = "0" ;
		pRVlr = "0" ;
		fATime = 0 ;
		lGsmATime = 0 ;
		lGprsATime = 0 ;
		pMode = 0 ;
		trStatus = 3 ;
		useType = 0 ;
		rejCount = 0 ;
		accPSt = 0 ;
		lTrTime = 0 ;
		lMMTime = 0 ;
		lPMMTime = 0 ;
		lRZone = -1 ;
		lRAppCos = 0 ;
		lRTrMech = -1 ;
		cRZone = -1 ;
		cRAppCos = 0 ;
		cRTrMech = -1 ;
		sriACnt = 0 ;
		pmsDel = 0 ;
		pmmDcnt = 0 ;
		tmmDCnt = 0 ;
		pRStatus = 0 ;
		dRnaClr = 0 ;
		lRnaTime = 0 ;
		sOtaReq = 0 ;
		rnaClrZn = -1 ;
		rnaClrCnt = 0 ;
		nGsmNode = 0 ;
		nGprsNode = 0 ;
		nGsmNw = 0 ;
		nGprsNw = 0 ;
		lOtaQRTme = 0 ;
		stFExpTme = 0 ;
		stFRejCnt = 0 ;
		ltFExpTme = 0 ;
		ltFRejCnt = 0 ;
		inGsmTme = 0 ;
		inGprsTme = 0 ;
		ss7PsiSts = 0 ;
		nGsmGAtt = 0 ;
		nGprsGAtt = 0 ;
		nGsmNIN = 0 ;
		nGprsNIN = 0 ;
		lRegPZn = 0 ;
		lRegPACos = 0 ;
		lRgPTMch = 0 ;
		cRegPZn = 0 ;
		cRegPACos = 0 ;
		cRgPTMch = 0 ;
		cEvtArea = 0 ;
		lEvtArea = 0 ;
		ss7CLDTm = 0 ;
		aULInfo = 0 ;
		brgTxnId = -1 ;
		bgsmStat = 3 ;
		bgprsStat = 3 ;
		lac = "0" ;
		cellId = "0" ;
		isHBlock = 0 ;
		cellType = "0" ;
		psiSts = 0 ;
		clSts = 0 ;
		srismSts = 0 ;
		clDTime = 0 ;
		noVVlr = 0 ;
		bZFUlType = 0 ;
		rtyLcCnt = 0 ;
		brgMech = 0 ;
		isAgrsve = 0 ;
		fallBType = 1 ;
		prevCMode = 1 ;
		isApCCell = 0 ;
		isFCExp = 0 ;
		autoCMode = 0 ;
		brgLTEsts = 3 ;
		isForCell = 0 ;
		blkType = -1 ;
		bPhMode = 0 ;
		brgSts = 3 ;
		bPmDetCnt = 0 ;
		bTmDetCnt = 0 ;
		bLPmmTime = 0 ;
		bFAttTime = 0 ;
		lAttTime = 0 ;
		bLVlr = "0" ;
		bLSgsn = "0" ;
		bCVlr = "0" ;
		bCSgsn = "0" ;
		bStFETime = 0 ;
		bStFRCnt = 0 ;
		bLtFETime = 0 ;
		bLtFRCnt = 0 ;
		brgLMme = "0" ;
		brgCMme = "0" ;
		bLLAppCos = 0 ;
		lBrgARCde = 0 ;
		bLTmmDCnt = 0 ;
		pLocVlr = "0" ;
		pLocLac = "0" ;
		pLocCell = "0" ;
		pLocNw = -1 ;
		pLocType = -1 ;
		bAReason = 0 ;
		cLocPsiSt = 0 ;
		msisdnP = 0 ;
		opCode = 0 ;
		instId = "0" ;
		moveTMain = 0 ;
		lUpdTime = 0 ;
		lLdapQTme = 0 ;
		lteSts = 3 ;
		lteRsn = 0 ;
		lteNRej = 0 ;
		lteCRNwid = 0 ;
		lLteNwid = 0 ;
		nLteNodes = 0 ;
		lMme = "0" ;
		cMme = "0" ;
		nLteNw = 0 ;
		lRMme = "0" ;
		lLAttTme = 0 ;
		pRat = 0 ;
		cRat = 0 ;
		csfbFlg = 0 ;
		rSesId = "0" ;
		rAuthSts = 0 ;
		lLappCos = 0 ;
		cRMcc = "0" ;
		cRMnc = "0" ;
		dRMme = "0" ;
		dLteRNw = 0 ;
		idrSts = 0 ;
		voiceRMsg = 0 ;
		cRMmeRelm = "0" ;
		cRMmeHst = "0" ;
		lTTimeMse = 0 ;
		lTmmDCnt = 0 ;
		nLNInNw = 0 ;
		rMme = "0" ;
		odApCos = 0 ;
		cInst = 0 ;
		cRInst = 0 ;
		vNwVlrLst = "0" ;
		vVlrLst = "0" ;
		cosList = "0" ;
		volteSts = 0 ;
		tVolteLst = "0" ;
		actImsi = "0" ;
		lVolteTrTm = 0 ;
		rrStartTm = 0 ;
		rrStatus = 0 ;
		lIMSAPNTm = 0 ;
		cImei = "0" ;
		pRTime = 0 ;
		pRSts = 0 ;
		rtrcosLst = "0" ;
		datatype = true ;
		nwType = "P" ;
	}
}
