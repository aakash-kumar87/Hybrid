package com.lifecycle.enums;

public class Courses {
	public enum status {
		Active, Archived, Draft // Proposed
	}

	public enum active {
		True(true), False(false);
		private boolean value;

		active(Boolean v) {
			value = v;
		}

		public boolean getActiveValue() {
			return value;
		}
	}

	public enum published_in_handbook {
		Yes(1), No(0), Draft(2);
		private int value;

		published_in_handbook(int v) {
			value = v;
		}

		public int getValue() {
			return value;
		}
	}

	public enum intakePeriod {
		Term2("03067bf7db7993009c2c403c3a961997"), FullYearSemester("41df292adb6b97009c2c403c3a961991"),
		Semester2("4df6cc954f9d5b404aa6eb4f0310c798"), Term3("601633b7db7993009c2c403c3a9619ab"),
		WinterTerm("8aefa126db6b97009c2c403c3a9619ce"), SummerCanberra("9bfdaa8fdb4ed300bfe9c4048a961960"),
		Semester1("9e4588954f9d5b404aa6eb4f0310c745"), SummerTerm("b8f53777db7993009c2c403c3a9619e4"),
		Term1("bc067bf7db7993009c2c403c3a961994");
		private String value;

		intakePeriod(String v) {
			value = v;
		}

		public String getIntakeCode() {
			return value;
		}
	}

	public enum deliveryMethod {
		FaceToFace("c7e786aedbeb97009c2c403c3a9619c9"), Distance("fea84aaedbeb97009c2c403c3a961906"),
		FullyOnline("8dc8caaedbeb97009c2c403c3a9619a4"), Research("6ed88aaedbeb97009c2c403c3a9619ab");

		private String value;

		deliveryMethod(String v) {
			value = v;
		}

		public String getDeliveryCode() {
			return value;
		}
	}

	public enum location {
		Canberra("d7470b6c4f115b404aa6eb4f0310c79b"), Paddington("007d533c4f441b009e2bfd501310c712"),
		Sydney("196234bfdb0f8b005012ff0dbf961912"), Randwick("62b1be25dbc4d70014c5f4e9bf9619ef"),
		Kensington("6a49b4034f4d97404aa6eb4f0310c79b");

		private String value;

		location(String v) {
			value = v;
		}

		public String getLocationCode() {
			return value;
		}
	}
}
