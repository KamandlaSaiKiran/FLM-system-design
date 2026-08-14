# FLM-system-design

Java + OOP fundamentals course. Each folder below is one class session.

## class-1-Introduction-setup
Dev environment setup: JDK 21, IntelliJ IDEA, GitHub/Git, OpenAI Codex CLI, and Wispr Flow (voice-to-text) for AI-assisted coding.

## class-2-java-basics
Core Java syntax and classes — the basics needed before writing real OOP code.

## class-3-Debugging-IntellJ
Debugging in IntelliJ: breakpoints, stepping through code, inspecting objects and classes at runtime.

## class-4-Inheritance
Encapsulation and inheritance. `Dog` / `GermanShefard extends Dog` example showing a subclass inheriting behavior (`doBark()`) from its parent.

## class-5-polymorphism
Runtime polymorphism via `IDog` interface (`Labrador`, `Pomeranian` overriding `doBark()`, dispatched through `DogSoundManager`) plus method overloading in `Student.print()`.

## class-6-abstraction
Abstraction with the `IDiscount` interface and interchangeable implementations (`MembershipDiscount`, `CreditCardDiscount`, `CouponDiscount`) — same interface, swappable logic.

## class-7-splitwise-1
Design session for a Splitwise-style expense-splitting app — sketching the OOP model (users, groups, expenses, splits) before writing code.

## class-8-splitwise-code
Implementation of the Splitwise design: `User`, `Group`, `Expense` with polymorphic split strategies (`EqualExpense`, `ExactAmountExpense`, `PercentageExpense`) — ties together inheritance, polymorphism, and abstraction from earlier classes.

## class-9-splitwise-code-complete
Finished, working Splitwise app: creates users/groups, adds equal and percentage-split expenses, and computes each member's running balance end-to-end (`Splitwise`, `Group.getBalance()`).

## class-10-SOLID-1
SOLID principles, part 1 — theory on decoupling, covering the Single Responsibility and Open/Closed principles.

## class-11-Solid-2
SOLID principles, part 2 — recaps bad SRP/OCP code (`ShapeCalculator` with if-else chains per shape for area/volume) and introduces the Liskov Substitution Principle: `Line implements Shape` but throws `UnsupportedOperationException` on `getArea()`/`getVolume()` since a 1D shape has neither, forcing `AreaCalculator` to defensively `instanceof`-check and skip it — a textbook LSP violation.

## class-12-solid-3
SOLID principles, part 3 — the fix. Splits the fat `Shape` interface into `Shape1D`/`Shape2D`/`Shape3D` (Interface Segregation fixed), makes `AreaCalculator`/`VolumeCalculator` take their shape list via constructor injection instead of creating it internally (Dependency Inversion fixed), and removes the `instanceof` check entirely since every `Shape2D` now honestly honours the `getArea()` contract (Liskov fixed). Closes out L, I, and D of SOLID.

## class-14-design-pattern-begin-strategypattern-1
Intro to design patterns — Strategy Pattern, part 1 (theory).

## class-15-strategy-pattern-2
Strategy Pattern, part 2 (theory continued).

## class-16-Template-Pattern
Template Method Pattern: abstract `BeverageMaker` defines the fixed algorithm skeleton (`boilWater → brew → pourInACup → addCondiments`), with `CoffeeMaker`/`TeaMaker` overriding only the varying steps (`brew()`, `addCondiments()`).

## class-17-payment-processor-template-pattern
Template Pattern applied to a real scenario: abstract `PaymentProcessor.processOrder()` fixes the steps (validate → OTP check → create payment → pay → log), while `CardPaymentProcessor`/`CashPaymentProcessor`/`UPIPaymentProcessor` each supply their own `createPayment()` via `IPayment` implementations (`CardPayment`, `CashPayment`, `UPIPayment`).

## class-18-Builder
Builder Pattern: compares a `UserProfile` with one bulky 9-arg constructor (order-dependent, easy to mis-call) against a fluent `Builder` inner class (`.name(...).email(...).age(...).build()`) that reads clearly and survives field-order/field-count changes.

## class-19-state-pattern
State Pattern via a `MediaPlayer`: starts from bad code (`bad-code/` uses a raw `State` enum with if-else branching), then fixes it with `IState` interface (`play`/`pause`/`stop`) implemented by `PlayState`/`PauseState`/`StopState` — `MediaPlayer` delegates to its current state object instead of branching on an enum, and swaps state via `setState()`.

## class-20-Singleton
Singleton Pattern: private constructor plus a static `getInstance()` that lazily creates the one shared instance on first call and returns it on every call after — ensures only one object of the class ever exists.

## class-21-Observer-pattern
Observer Pattern via a YouTube notification example: `ISubject` (`subscribe`/`unsubscribe`) implemented by `YouTubeChannel`, `ISubscriber` implemented by `EmailSubscriber`/`SMSSubscriber` — `uploadVideo()` triggers `notifySubscribers()`, looping through all subscribers and calling their `notifyUser()`, so any number of observer types can react to one event without the channel knowing their details.

## class-22-factory-method
Factory Method and Abstract Factory, side by side. `Factory-for-Game`: abstract `Level.createEnemy()` is the factory method — `ForestLevel`/`SnowLevel`/`DesertLevel` each decide their own `IEnemy` (`Goblin`/`SnowMan`/`SandMan`) while `Level`'s shared logic never changes. `abstract-factory-furniture-example`: `FurnitureFactory` (`createChair`/`createSofa`) implemented by `ModernFurnitureFactory`/`VictorianFurnitureFactory`, guaranteeing `FurnitureStore` always gets a matching family of pieces, never a mismatched Modern chair with a Victorian sofa.

## class-23-Adapter-pattern
Adapter Pattern (theory) — wrapping an incompatible class (e.g. a third-party/legacy API) behind your existing interface so the rest of the codebase can keep calling the familiar contract without knowing a translation is happening underneath.
