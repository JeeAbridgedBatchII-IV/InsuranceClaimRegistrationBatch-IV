package com.insurance.claim.bean;

public class Claim {
		private long ClaimNumber;
		private String ClaimReason;
		private String AccidentLocationStreet;
		private String AccidentCity;
		private String AccidentState;
		private long AccidentZip;
		private String ClaimType;
		private long PolicyNumber;

		public Claim() {
		}

		public Claim(long PolicyNumber) {
			super();
			this.PolicyNumber = PolicyNumber;
		}
		
		public Claim(long ClaimNumber, String ClaimReason, String ClaimType,
				long PolicyNumber) {
			super();
			this.ClaimNumber = ClaimNumber;
			this.ClaimReason = ClaimReason;
			this.ClaimType = ClaimType;
			this.PolicyNumber = PolicyNumber;
		}



		public Claim(long ClaimNumber, String ClaimReason,
				String AccidentLocationStreet, String AccidentCity,
				String AccidentState, long AccidentZip, String ClaimType,
				long PolicyNumber) {
			super();
			this.ClaimNumber = ClaimNumber;
			this.ClaimReason = ClaimReason;
			this.AccidentLocationStreet = AccidentLocationStreet;
			this.AccidentCity = AccidentCity;
			this.AccidentState = AccidentState;
			this.AccidentZip = AccidentZip;
			this.ClaimType = ClaimType;
			this.PolicyNumber = PolicyNumber;
		}

		
		
		
		public Claim(String ClaimReason, String AccidentLocationStreet,
				String AccidentCity, String AccidentState, long AccidentZip,
				String ClaimType, long PolicyNumber) {
			super();
			this.ClaimReason = ClaimReason;
			this.AccidentLocationStreet = AccidentLocationStreet;
			this.AccidentCity = AccidentCity;
			this.AccidentState = AccidentState;
			this.AccidentZip = AccidentZip;
			this.ClaimType = ClaimType;
			this.PolicyNumber = PolicyNumber;
		}

		


		public long getClaimNumber() {
			return ClaimNumber;
		}



		public void setClaimNumber(long ClaimNumber) {
			this.ClaimNumber = ClaimNumber;
		}



		public String getClaimReason() {
			return ClaimReason;
		}



		public void setClaimReason(String ClaimReason) {
			this.ClaimReason = ClaimReason;
		}



		public String getAccidentLocationStreet() {
			return AccidentLocationStreet;
		}



		public void setAccidentLocationStreet(String AccidentLocationStreet) {
			this.AccidentLocationStreet = AccidentLocationStreet;
		}



		public String getAccidentCity() {
			return AccidentCity;
		}



		public void setAccidentCity(String AccidentCity) {
			this.AccidentCity = AccidentCity;
		}



		public String getAccidentState() {
			return AccidentState;
		}



		public void setAccidentState(String AccidentState) {
			this.AccidentState = AccidentState;
		}



		public long getAccidentZip() {
			return AccidentZip;
		}



		public void setAccidentZip(long AccidentZip) {
			this.AccidentZip = AccidentZip;
		}



		public String getClaimType() {
			return ClaimType;
		}



		public void setClaimType(String ClaimType) {
			this.ClaimType = ClaimType;
		}



		public long getPolicyNumber() {
			return PolicyNumber;
		}



		public void setPolicyNumber(long PolicyNumber) {
			this.PolicyNumber = PolicyNumber;
		}



		@Override
		public String toString() {
			return "ClaimNumber=" + ClaimNumber + "\nClaimReason="
					+ ClaimReason + "\nAccidentLocationStreet="
					+ AccidentLocationStreet + "\nAccidentCity=" + AccidentCity
					+ "\nAccidentState=" + AccidentState + "\nAccidentZip="
					+ AccidentZip + "\nClaimType=" + ClaimType + "\nPolicyNumber="
					+ PolicyNumber + "\n";
		}

	}

