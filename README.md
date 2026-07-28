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
