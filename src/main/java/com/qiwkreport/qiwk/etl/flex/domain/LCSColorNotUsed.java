package com.qiwkreport.qiwk.etl.flex.domain;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abhilash
 *
 */

/*@Entity
@Table(name = "LCSCOLOR")*/
public class LCSColorNotUsed {

	/**
	 * Don't include any id genrator type here when developing actual FR/NC job
	 * use database sequence generator or any other genrator based on business
	 * decision.
	 */
	/*@Id
	@Column(name = "IDA2A2")*/
	private int IDA2A2;

	@Column(name = "IDA2TYPEDEFINITIONREFERENCE")
	private int IDA2TYPEDEFINITIONREFERENCE;

	@Column(name = "ADMINISTRATIVELOCKISNULL")
	private int ADMINISTRATIVELOCKISNULL;

	@Column(name = "IDA3CONTAINERREFERENCE")
	private int IDA3CONTAINERREFERENCE;

	@Column(name = "IDA3B8")
	private int IDA3B8;

	@Column(name = "IDA3A7")
	private int IDA3A7;

	@Column(name = "IDA3DOMAINREF")
	private int IDA3DOMAINREF;

	@Column(name = "IDA3A2FOLDERINGINFO")
	private int IDA3A2FOLDERINGINFO;

	@Column(name = "IDA3B2FOLDERINGINFO")
	private int IDA3B2FOLDERINGINFO;

	@Column(name = "INHERITEDDOMAIN")
	private int INHERITEDDOMAIN;

	@Column(name = "IDA3C8")
	private int IDA3C8;

	@Column(name = "IDA3A2OWNERSHIP")
	private int IDA3A2OWNERSHIP;

	@Column(name = "ATGATESTATE")
	private int ATGATESTATE;

	@Column(name = "IDA3A2STATE")
	private int IDA3A2STATE;

	@Column(name = "TEAMIDISNULL")
	private int TEAMIDISNULL;

	@Column(name = "BRANCHIDA2TYPEDEFINITIONREFE")
	private int BRANCHIDA2TYPEDEFINITIONREFE;

	@Column(name = "IDA3TEAMID")
	private int IDA3TEAMID;

	@Column(name = "TEAMTEMPLATEIDISNULL")
	private int TEAMTEMPLATEIDISNULL;

	@Column(name = "IDA3TEAMTEMPLATEID")
	private int IDA3TEAMTEMPLATEID;

	@Column(name = "MARKFORDELETEA2")
	private int MARKFORDELETEA2;

	@Column(name = "UPDATECOUNTA2")
	private int UPDATECOUNTA2;

	@Column(name = "CLASSNAMEKEYTEAMTEMPLATEID")
	private String CLASSNAMEKEYTEAMTEMPLATEID;

	@Column(name = "TYPEDISPLAY")
	private String TYPEDISPLAY;

	@Column(name = "PTC_STR_1TYPEINFOLCSCOLOR")
	private String PTC_STR_1TYPEINFOLCSCOLOR;

	@Column(name = "TYPEADMINISTRATIVELOCK")
	private String TYPEADMINISTRATIVELOCK;

	@Column(name = "COLORHEXIDECIMALVALUE")
	private String COLORHEXIDECIMALVALUE;

	@Column(name = "COLORNAME")
	private String COLORNAME;

	@Column(name = "CLASSNAMEKEYCONTAINERREFEREN")
	private String CLASSNAMEKEYCONTAINERREFEREN;

	@Column(name = "CLASSNAMEKEYB8")
	private String CLASSNAMEKEYB8;

	@Column(name = "CLASSNAMEKEYA7")
	private String CLASSNAMEKEYA7;

	@Column(name = "CLASSNAMEKEYDOMAINREF")
	private String CLASSNAMEKEYDOMAINREF;

	@Column(name = "ENTRYSETADHOCACL")
	private String ENTRYSETADHOCACL;

	@Column(name = "EVENTSET")
	private String EVENTSET;

	@Column(name = "FLEXTYPEIDPATH")
	private String FLEXTYPEIDPATH;

	@Column(name = "CLASSNAMEKEYA2FOLDERINGINFO")
	private String CLASSNAMEKEYA2FOLDERINGINFO;

	@Column(name = "CLASSNAMEKEYB2FOLDERINGINFO")
	private String CLASSNAMEKEYB2FOLDERINGINFO;

	@Column(name = "INDEXERSINDEXERSET")
	private String INDEXERSINDEXERSET;

	@Column(name = "CLASSNAMEKEYC8")
	private String CLASSNAMEKEYC8;

	@Column(name = "CLASSNAMEKEYA2OWNERSHIP")
	private String CLASSNAMEKEYA2OWNERSHIP;

	@Column(name = "SECURITYLABELS")
	private String SECURITYLABELS;

	@Column(name = "CLASSNAMEKEYA2STATE")
	private String CLASSNAMEKEYA2STATE;

	@Column(name = "STATESTATE")
	private String STATESTATE;

	@Column(name = "IDA2A2")
	private String CLASSNAMEKEYTEAMID;

	@Column(name = "IDA2A2")
	private String CLASSNAMEA2A2;

	@Column(name = "IDA2A2")
	private String THUMBNAIL;

	@Column(name = "IDA2A2")
	private Date CREATESTAMPA2;

	@Column(name = "IDA2A2")
	private Date MODIFYSTAMPA2;

	@Column(name = "IDA2A2")
	private Date UPDATESTAMPA2;

	@Column(name = "IDA2A2")
	private byte[] BLOB$ENTRYSETADHOCACL;

	public LCSColor() {
		super();
	}

	public LCSColor(int iDA2A2, int iDA2TYPEDEFINITIONREFERENCE, int aDMINISTRATIVELOCKISNULL,
			int iDA3CONTAINERREFERENCE, int iDA3B8, int iDA3A7, int iDA3DOMAINREF, int iDA3A2FOLDERINGINFO,
			int iDA3B2FOLDERINGINFO, int iNHERITEDDOMAIN, int iDA3C8, int iDA3A2OWNERSHIP, int aTGATESTATE,
			int iDA3A2STATE, int tEAMIDISNULL, int bRANCHIDA2TYPEDEFINITIONREFE, int iDA3TEAMID,
			int tEAMTEMPLATEIDISNULL, int iDA3TEAMTEMPLATEID, int mARKFORDELETEA2, int uPDATECOUNTA2,
			String cLASSNAMEKEYTEAMTEMPLATEID, String tYPEDISPLAY, String pTC_STR_1TYPEINFOLCSCOLOR,
			String tYPEADMINISTRATIVELOCK, String cOLORHEXIDECIMALVALUE, String cOLORNAME,
			String cLASSNAMEKEYCONTAINERREFEREN, String cLASSNAMEKEYB8, String cLASSNAMEKEYA7,
			String cLASSNAMEKEYDOMAINREF, String eNTRYSETADHOCACL, String eVENTSET, String fLEXTYPEIDPATH,
			String cLASSNAMEKEYA2FOLDERINGINFO, String cLASSNAMEKEYB2FOLDERINGINFO, String iNDEXERSINDEXERSET,
			String cLASSNAMEKEYC8, String cLASSNAMEKEYA2OWNERSHIP, String sECURITYLABELS, String cLASSNAMEKEYA2STATE,
			String sTATESTATE, String cLASSNAMEKEYTEAMID, String cLASSNAMEA2A2, String tHUMBNAIL, Date cREATESTAMPA2,
			Date mODIFYSTAMPA2, Date uPDATESTAMPA2, byte[] bLOB$ENTRYSETADHOCACL) {
		super();
		IDA2A2 = iDA2A2;
		IDA2TYPEDEFINITIONREFERENCE = iDA2TYPEDEFINITIONREFERENCE;
		ADMINISTRATIVELOCKISNULL = aDMINISTRATIVELOCKISNULL;
		IDA3CONTAINERREFERENCE = iDA3CONTAINERREFERENCE;
		IDA3B8 = iDA3B8;
		IDA3A7 = iDA3A7;
		IDA3DOMAINREF = iDA3DOMAINREF;
		IDA3A2FOLDERINGINFO = iDA3A2FOLDERINGINFO;
		IDA3B2FOLDERINGINFO = iDA3B2FOLDERINGINFO;
		INHERITEDDOMAIN = iNHERITEDDOMAIN;
		IDA3C8 = iDA3C8;
		IDA3A2OWNERSHIP = iDA3A2OWNERSHIP;
		ATGATESTATE = aTGATESTATE;
		IDA3A2STATE = iDA3A2STATE;
		TEAMIDISNULL = tEAMIDISNULL;
		BRANCHIDA2TYPEDEFINITIONREFE = bRANCHIDA2TYPEDEFINITIONREFE;
		IDA3TEAMID = iDA3TEAMID;
		TEAMTEMPLATEIDISNULL = tEAMTEMPLATEIDISNULL;
		IDA3TEAMTEMPLATEID = iDA3TEAMTEMPLATEID;
		MARKFORDELETEA2 = mARKFORDELETEA2;
		UPDATECOUNTA2 = uPDATECOUNTA2;
		CLASSNAMEKEYTEAMTEMPLATEID = cLASSNAMEKEYTEAMTEMPLATEID;
		TYPEDISPLAY = tYPEDISPLAY;
		PTC_STR_1TYPEINFOLCSCOLOR = pTC_STR_1TYPEINFOLCSCOLOR;
		TYPEADMINISTRATIVELOCK = tYPEADMINISTRATIVELOCK;
		COLORHEXIDECIMALVALUE = cOLORHEXIDECIMALVALUE;
		COLORNAME = cOLORNAME;
		CLASSNAMEKEYCONTAINERREFEREN = cLASSNAMEKEYCONTAINERREFEREN;
		CLASSNAMEKEYB8 = cLASSNAMEKEYB8;
		CLASSNAMEKEYA7 = cLASSNAMEKEYA7;
		CLASSNAMEKEYDOMAINREF = cLASSNAMEKEYDOMAINREF;
		ENTRYSETADHOCACL = eNTRYSETADHOCACL;
		EVENTSET = eVENTSET;
		FLEXTYPEIDPATH = fLEXTYPEIDPATH;
		CLASSNAMEKEYA2FOLDERINGINFO = cLASSNAMEKEYA2FOLDERINGINFO;
		CLASSNAMEKEYB2FOLDERINGINFO = cLASSNAMEKEYB2FOLDERINGINFO;
		INDEXERSINDEXERSET = iNDEXERSINDEXERSET;
		CLASSNAMEKEYC8 = cLASSNAMEKEYC8;
		CLASSNAMEKEYA2OWNERSHIP = cLASSNAMEKEYA2OWNERSHIP;
		SECURITYLABELS = sECURITYLABELS;
		CLASSNAMEKEYA2STATE = cLASSNAMEKEYA2STATE;
		STATESTATE = sTATESTATE;
		CLASSNAMEKEYTEAMID = cLASSNAMEKEYTEAMID;
		CLASSNAMEA2A2 = cLASSNAMEA2A2;
		THUMBNAIL = tHUMBNAIL;
		CREATESTAMPA2 = cREATESTAMPA2;
		MODIFYSTAMPA2 = mODIFYSTAMPA2;
		UPDATESTAMPA2 = uPDATESTAMPA2;
		BLOB$ENTRYSETADHOCACL = bLOB$ENTRYSETADHOCACL;
	}

	public int getIDA2A2() {
		return IDA2A2;
	}

	public void setIDA2A2(int iDA2A2) {
		IDA2A2 = iDA2A2;
	}

	public int getIDA2TYPEDEFINITIONREFERENCE() {
		return IDA2TYPEDEFINITIONREFERENCE;
	}

	public void setIDA2TYPEDEFINITIONREFERENCE(int iDA2TYPEDEFINITIONREFERENCE) {
		IDA2TYPEDEFINITIONREFERENCE = iDA2TYPEDEFINITIONREFERENCE;
	}

	public int getADMINISTRATIVELOCKISNULL() {
		return ADMINISTRATIVELOCKISNULL;
	}

	public void setADMINISTRATIVELOCKISNULL(int aDMINISTRATIVELOCKISNULL) {
		ADMINISTRATIVELOCKISNULL = aDMINISTRATIVELOCKISNULL;
	}

	public int getIDA3CONTAINERREFERENCE() {
		return IDA3CONTAINERREFERENCE;
	}

	public void setIDA3CONTAINERREFERENCE(int iDA3CONTAINERREFERENCE) {
		IDA3CONTAINERREFERENCE = iDA3CONTAINERREFERENCE;
	}

	public int getIDA3B8() {
		return IDA3B8;
	}

	public void setIDA3B8(int iDA3B8) {
		IDA3B8 = iDA3B8;
	}

	public int getIDA3A7() {
		return IDA3A7;
	}

	public void setIDA3A7(int iDA3A7) {
		IDA3A7 = iDA3A7;
	}

	public int getIDA3DOMAINREF() {
		return IDA3DOMAINREF;
	}

	public void setIDA3DOMAINREF(int iDA3DOMAINREF) {
		IDA3DOMAINREF = iDA3DOMAINREF;
	}

	public int getIDA3A2FOLDERINGINFO() {
		return IDA3A2FOLDERINGINFO;
	}

	public void setIDA3A2FOLDERINGINFO(int iDA3A2FOLDERINGINFO) {
		IDA3A2FOLDERINGINFO = iDA3A2FOLDERINGINFO;
	}

	public int getIDA3B2FOLDERINGINFO() {
		return IDA3B2FOLDERINGINFO;
	}

	public void setIDA3B2FOLDERINGINFO(int iDA3B2FOLDERINGINFO) {
		IDA3B2FOLDERINGINFO = iDA3B2FOLDERINGINFO;
	}

	public int getINHERITEDDOMAIN() {
		return INHERITEDDOMAIN;
	}

	public void setINHERITEDDOMAIN(int iNHERITEDDOMAIN) {
		INHERITEDDOMAIN = iNHERITEDDOMAIN;
	}

	public int getIDA3C8() {
		return IDA3C8;
	}

	public void setIDA3C8(int iDA3C8) {
		IDA3C8 = iDA3C8;
	}

	public int getIDA3A2OWNERSHIP() {
		return IDA3A2OWNERSHIP;
	}

	public void setIDA3A2OWNERSHIP(int iDA3A2OWNERSHIP) {
		IDA3A2OWNERSHIP = iDA3A2OWNERSHIP;
	}

	public int getATGATESTATE() {
		return ATGATESTATE;
	}

	public void setATGATESTATE(int aTGATESTATE) {
		ATGATESTATE = aTGATESTATE;
	}

	public int getIDA3A2STATE() {
		return IDA3A2STATE;
	}

	public void setIDA3A2STATE(int iDA3A2STATE) {
		IDA3A2STATE = iDA3A2STATE;
	}

	public int getTEAMIDISNULL() {
		return TEAMIDISNULL;
	}

	public void setTEAMIDISNULL(int tEAMIDISNULL) {
		TEAMIDISNULL = tEAMIDISNULL;
	}

	public int getBRANCHIDA2TYPEDEFINITIONREFE() {
		return BRANCHIDA2TYPEDEFINITIONREFE;
	}

	public void setBRANCHIDA2TYPEDEFINITIONREFE(int bRANCHIDA2TYPEDEFINITIONREFE) {
		BRANCHIDA2TYPEDEFINITIONREFE = bRANCHIDA2TYPEDEFINITIONREFE;
	}

	public int getIDA3TEAMID() {
		return IDA3TEAMID;
	}

	public void setIDA3TEAMID(int iDA3TEAMID) {
		IDA3TEAMID = iDA3TEAMID;
	}

	public int getTEAMTEMPLATEIDISNULL() {
		return TEAMTEMPLATEIDISNULL;
	}

	public void setTEAMTEMPLATEIDISNULL(int tEAMTEMPLATEIDISNULL) {
		TEAMTEMPLATEIDISNULL = tEAMTEMPLATEIDISNULL;
	}

	public int getIDA3TEAMTEMPLATEID() {
		return IDA3TEAMTEMPLATEID;
	}

	public void setIDA3TEAMTEMPLATEID(int iDA3TEAMTEMPLATEID) {
		IDA3TEAMTEMPLATEID = iDA3TEAMTEMPLATEID;
	}

	public int getMARKFORDELETEA2() {
		return MARKFORDELETEA2;
	}

	public void setMARKFORDELETEA2(int mARKFORDELETEA2) {
		MARKFORDELETEA2 = mARKFORDELETEA2;
	}

	public int getUPDATECOUNTA2() {
		return UPDATECOUNTA2;
	}

	public void setUPDATECOUNTA2(int uPDATECOUNTA2) {
		UPDATECOUNTA2 = uPDATECOUNTA2;
	}

	public String getCLASSNAMEKEYTEAMTEMPLATEID() {
		return CLASSNAMEKEYTEAMTEMPLATEID;
	}

	public void setCLASSNAMEKEYTEAMTEMPLATEID(String cLASSNAMEKEYTEAMTEMPLATEID) {
		CLASSNAMEKEYTEAMTEMPLATEID = cLASSNAMEKEYTEAMTEMPLATEID;
	}

	public String getTYPEDISPLAY() {
		return TYPEDISPLAY;
	}

	public void setTYPEDISPLAY(String tYPEDISPLAY) {
		TYPEDISPLAY = tYPEDISPLAY;
	}

	public String getPTC_STR_1TYPEINFOLCSCOLOR() {
		return PTC_STR_1TYPEINFOLCSCOLOR;
	}

	public void setPTC_STR_1TYPEINFOLCSCOLOR(String pTC_STR_1TYPEINFOLCSCOLOR) {
		PTC_STR_1TYPEINFOLCSCOLOR = pTC_STR_1TYPEINFOLCSCOLOR;
	}

	public String getTYPEADMINISTRATIVELOCK() {
		return TYPEADMINISTRATIVELOCK;
	}

	public void setTYPEADMINISTRATIVELOCK(String tYPEADMINISTRATIVELOCK) {
		TYPEADMINISTRATIVELOCK = tYPEADMINISTRATIVELOCK;
	}

	public String getCOLORHEXIDECIMALVALUE() {
		return COLORHEXIDECIMALVALUE;
	}

	public void setCOLORHEXIDECIMALVALUE(String cOLORHEXIDECIMALVALUE) {
		COLORHEXIDECIMALVALUE = cOLORHEXIDECIMALVALUE;
	}

	public String getCOLORNAME() {
		return COLORNAME;
	}

	public void setCOLORNAME(String cOLORNAME) {
		COLORNAME = cOLORNAME;
	}

	public String getCLASSNAMEKEYCONTAINERREFEREN() {
		return CLASSNAMEKEYCONTAINERREFEREN;
	}

	public void setCLASSNAMEKEYCONTAINERREFEREN(String cLASSNAMEKEYCONTAINERREFEREN) {
		CLASSNAMEKEYCONTAINERREFEREN = cLASSNAMEKEYCONTAINERREFEREN;
	}

	public String getCLASSNAMEKEYB8() {
		return CLASSNAMEKEYB8;
	}

	public void setCLASSNAMEKEYB8(String cLASSNAMEKEYB8) {
		CLASSNAMEKEYB8 = cLASSNAMEKEYB8;
	}

	public String getCLASSNAMEKEYA7() {
		return CLASSNAMEKEYA7;
	}

	public void setCLASSNAMEKEYA7(String cLASSNAMEKEYA7) {
		CLASSNAMEKEYA7 = cLASSNAMEKEYA7;
	}

	public String getCLASSNAMEKEYDOMAINREF() {
		return CLASSNAMEKEYDOMAINREF;
	}

	public void setCLASSNAMEKEYDOMAINREF(String cLASSNAMEKEYDOMAINREF) {
		CLASSNAMEKEYDOMAINREF = cLASSNAMEKEYDOMAINREF;
	}

	public String getENTRYSETADHOCACL() {
		return ENTRYSETADHOCACL;
	}

	public void setENTRYSETADHOCACL(String eNTRYSETADHOCACL) {
		ENTRYSETADHOCACL = eNTRYSETADHOCACL;
	}

	public String getEVENTSET() {
		return EVENTSET;
	}

	public void setEVENTSET(String eVENTSET) {
		EVENTSET = eVENTSET;
	}

	public String getFLEXTYPEIDPATH() {
		return FLEXTYPEIDPATH;
	}

	public void setFLEXTYPEIDPATH(String fLEXTYPEIDPATH) {
		FLEXTYPEIDPATH = fLEXTYPEIDPATH;
	}

	public String getCLASSNAMEKEYA2FOLDERINGINFO() {
		return CLASSNAMEKEYA2FOLDERINGINFO;
	}

	public void setCLASSNAMEKEYA2FOLDERINGINFO(String cLASSNAMEKEYA2FOLDERINGINFO) {
		CLASSNAMEKEYA2FOLDERINGINFO = cLASSNAMEKEYA2FOLDERINGINFO;
	}

	public String getCLASSNAMEKEYB2FOLDERINGINFO() {
		return CLASSNAMEKEYB2FOLDERINGINFO;
	}

	public void setCLASSNAMEKEYB2FOLDERINGINFO(String cLASSNAMEKEYB2FOLDERINGINFO) {
		CLASSNAMEKEYB2FOLDERINGINFO = cLASSNAMEKEYB2FOLDERINGINFO;
	}

	public String getINDEXERSINDEXERSET() {
		return INDEXERSINDEXERSET;
	}

	public void setINDEXERSINDEXERSET(String iNDEXERSINDEXERSET) {
		INDEXERSINDEXERSET = iNDEXERSINDEXERSET;
	}

	public String getCLASSNAMEKEYC8() {
		return CLASSNAMEKEYC8;
	}

	public void setCLASSNAMEKEYC8(String cLASSNAMEKEYC8) {
		CLASSNAMEKEYC8 = cLASSNAMEKEYC8;
	}

	public String getCLASSNAMEKEYA2OWNERSHIP() {
		return CLASSNAMEKEYA2OWNERSHIP;
	}

	public void setCLASSNAMEKEYA2OWNERSHIP(String cLASSNAMEKEYA2OWNERSHIP) {
		CLASSNAMEKEYA2OWNERSHIP = cLASSNAMEKEYA2OWNERSHIP;
	}

	public String getSECURITYLABELS() {
		return SECURITYLABELS;
	}

	public void setSECURITYLABELS(String sECURITYLABELS) {
		SECURITYLABELS = sECURITYLABELS;
	}

	public String getCLASSNAMEKEYA2STATE() {
		return CLASSNAMEKEYA2STATE;
	}

	public void setCLASSNAMEKEYA2STATE(String cLASSNAMEKEYA2STATE) {
		CLASSNAMEKEYA2STATE = cLASSNAMEKEYA2STATE;
	}

	public String getSTATESTATE() {
		return STATESTATE;
	}

	public void setSTATESTATE(String sTATESTATE) {
		STATESTATE = sTATESTATE;
	}

	public String getCLASSNAMEKEYTEAMID() {
		return CLASSNAMEKEYTEAMID;
	}

	public void setCLASSNAMEKEYTEAMID(String cLASSNAMEKEYTEAMID) {
		CLASSNAMEKEYTEAMID = cLASSNAMEKEYTEAMID;
	}

	public String getCLASSNAMEA2A2() {
		return CLASSNAMEA2A2;
	}

	public void setCLASSNAMEA2A2(String cLASSNAMEA2A2) {
		CLASSNAMEA2A2 = cLASSNAMEA2A2;
	}

	public String getTHUMBNAIL() {
		return THUMBNAIL;
	}

	public void setTHUMBNAIL(String tHUMBNAIL) {
		THUMBNAIL = tHUMBNAIL;
	}

	public Date getCREATESTAMPA2() {
		return CREATESTAMPA2;
	}

	public void setCREATESTAMPA2(Date cREATESTAMPA2) {
		CREATESTAMPA2 = cREATESTAMPA2;
	}

	public Date getMODIFYSTAMPA2() {
		return MODIFYSTAMPA2;
	}

	public void setMODIFYSTAMPA2(Date mODIFYSTAMPA2) {
		MODIFYSTAMPA2 = mODIFYSTAMPA2;
	}

	public Date getUPDATESTAMPA2() {
		return UPDATESTAMPA2;
	}

	public void setUPDATESTAMPA2(Date uPDATESTAMPA2) {
		UPDATESTAMPA2 = uPDATESTAMPA2;
	}

	public byte[] getBLOB$ENTRYSETADHOCACL() {
		return BLOB$ENTRYSETADHOCACL;
	}

	public void setBLOB$ENTRYSETADHOCACL(byte[] bLOB$ENTRYSETADHOCACL) {
		BLOB$ENTRYSETADHOCACL = bLOB$ENTRYSETADHOCACL;
	}

	@Override
	public String toString() {
		return "LCSColor [IDA2A2=" + IDA2A2 + ", IDA2TYPEDEFINITIONREFERENCE=" + IDA2TYPEDEFINITIONREFERENCE
				+ ", ADMINISTRATIVELOCKISNULL=" + ADMINISTRATIVELOCKISNULL + ", IDA3CONTAINERREFERENCE="
				+ IDA3CONTAINERREFERENCE + ", IDA3B8=" + IDA3B8 + ", IDA3A7=" + IDA3A7 + ", IDA3DOMAINREF="
				+ IDA3DOMAINREF + ", IDA3A2FOLDERINGINFO=" + IDA3A2FOLDERINGINFO + ", IDA3B2FOLDERINGINFO="
				+ IDA3B2FOLDERINGINFO + ", INHERITEDDOMAIN=" + INHERITEDDOMAIN + ", IDA3C8=" + IDA3C8
				+ ", IDA3A2OWNERSHIP=" + IDA3A2OWNERSHIP + ", ATGATESTATE=" + ATGATESTATE + ", IDA3A2STATE="
				+ IDA3A2STATE + ", TEAMIDISNULL=" + TEAMIDISNULL + ", BRANCHIDA2TYPEDEFINITIONREFE="
				+ BRANCHIDA2TYPEDEFINITIONREFE + ", IDA3TEAMID=" + IDA3TEAMID + ", TEAMTEMPLATEIDISNULL="
				+ TEAMTEMPLATEIDISNULL + ", IDA3TEAMTEMPLATEID=" + IDA3TEAMTEMPLATEID + ", MARKFORDELETEA2="
				+ MARKFORDELETEA2 + ", UPDATECOUNTA2=" + UPDATECOUNTA2 + ", CLASSNAMEKEYTEAMTEMPLATEID="
				+ CLASSNAMEKEYTEAMTEMPLATEID + ", TYPEDISPLAY=" + TYPEDISPLAY + ", PTC_STR_1TYPEINFOLCSCOLOR="
				+ PTC_STR_1TYPEINFOLCSCOLOR + ", TYPEADMINISTRATIVELOCK=" + TYPEADMINISTRATIVELOCK
				+ ", COLORHEXIDECIMALVALUE=" + COLORHEXIDECIMALVALUE + ", COLORNAME=" + COLORNAME
				+ ", CLASSNAMEKEYCONTAINERREFEREN=" + CLASSNAMEKEYCONTAINERREFEREN + ", CLASSNAMEKEYB8="
				+ CLASSNAMEKEYB8 + ", CLASSNAMEKEYA7=" + CLASSNAMEKEYA7 + ", CLASSNAMEKEYDOMAINREF="
				+ CLASSNAMEKEYDOMAINREF + ", ENTRYSETADHOCACL=" + ENTRYSETADHOCACL + ", EVENTSET=" + EVENTSET
				+ ", FLEXTYPEIDPATH=" + FLEXTYPEIDPATH + ", CLASSNAMEKEYA2FOLDERINGINFO=" + CLASSNAMEKEYA2FOLDERINGINFO
				+ ", CLASSNAMEKEYB2FOLDERINGINFO=" + CLASSNAMEKEYB2FOLDERINGINFO + ", INDEXERSINDEXERSET="
				+ INDEXERSINDEXERSET + ", CLASSNAMEKEYC8=" + CLASSNAMEKEYC8 + ", CLASSNAMEKEYA2OWNERSHIP="
				+ CLASSNAMEKEYA2OWNERSHIP + ", SECURITYLABELS=" + SECURITYLABELS + ", CLASSNAMEKEYA2STATE="
				+ CLASSNAMEKEYA2STATE + ", STATESTATE=" + STATESTATE + ", CLASSNAMEKEYTEAMID=" + CLASSNAMEKEYTEAMID
				+ ", CLASSNAMEA2A2=" + CLASSNAMEA2A2 + ", THUMBNAIL=" + THUMBNAIL + ", CREATESTAMPA2=" + CREATESTAMPA2
				+ ", MODIFYSTAMPA2=" + MODIFYSTAMPA2 + ", UPDATESTAMPA2=" + UPDATESTAMPA2 + ", BLOB$ENTRYSETADHOCACL="
				+ Arrays.toString(BLOB$ENTRYSETADHOCACL) + "]";
	}

}
