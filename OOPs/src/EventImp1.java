
public class EventImp1 implements Event {

	@Override
	public void doSomething() {
		System.out.println("first event implementation");
	}

 static	class InnerEventImp1 implements Event {

		@Override
		public void doSomething() {
			System.out.println("2nd event implementation");
		}
		}

		public void doingSomething() {
			class InnerMostImp1 implements Event {

				@Override
				public void doSomething() {
					System.out.println("3rd event implementation");
				}

			}
			;
			new InnerMostImp1().doSomething();
		}

		public void doingSomethingAgain() {
			Event e = new Event() {
				@Override
				public void doSomething() {
					System.out.println("4th event implementation");
				}
			};
			e.doSomething();
		}

		public void doingSomethingOneLastTime() {
			Event e = () -> System.out.println("Fifth event implementation");
			e.doSomething();
		}

	

	public static void main(String[] args) {
		EventImp1 imp1 = new EventImp1();
		imp1.doSomething();

		// InnerEventImp1 = imp1.new InnerEventImp1();
		InnerEventImp1 innerImp1 = new EventImp1.InnerEventImp1();
		innerImp1.doSomething();

		imp1.doSomething();
		imp1.doingSomethingAgain();
		imp1.doingSomethingOneLastTime();

	}
}
