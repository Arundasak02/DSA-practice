# Design patterns — Java learning and interview practice

**23 runnable examples + 12 unsolved practical exercises.** Start with the patterns marked **First**, then **Next**. Reference patterns round out the GoF catalog; they do not all deserve equal interview-preparation time. Priority is a learning recommendation for a senior Java developer, not a measured interview-frequency ranking.

Examples are short, complete teaching programs. Exercises contain the contract, suggested patterns, follow-up questions and TODO methods in one Java file, with tests in the matching test package. No frameworks or external services are needed. You can add internal classes while keeping the tested public API.

## Before coding

Know interfaces, constructor injection, composition, inheritance, immutable values and collections. Prefer composition when independent behaviors need to vary. A Java lambda can implement a small Strategy or Command; a pattern does not require a large class hierarchy.

For every pattern, answer: **What changes? What stays stable? Which object owns the responsibility? What simpler alternative would work?** Learn the change it supports before learning its name.

## Creational

| Pattern / worked example | Priority | What to understand |
|---|---|---|
| [Builder](../src/main/java/dev/practice/patterns/creational/BuilderExample.java) | First | Validate an immutable trade order with optional settings. |
| [FactoryMethod](../src/main/java/dev/practice/patterns/creational/FactoryMethodExample.java) | First | Let a creator subclass choose the product it creates. |
| [AbstractFactory](../src/main/java/dev/practice/patterns/creational/AbstractFactoryExample.java) | Next | Supply a compatible family of collaborators. |
| [Singleton](../src/main/java/dev/practice/patterns/creational/SingletonExample.java) | First | Understand one-instance scope and its testing tradeoffs. |
| [Prototype](../src/main/java/dev/practice/patterns/creational/PrototypeExample.java) | Next | Copy a configured object with explicit copy depth. |

## Structural

| Pattern / worked example | Priority | What to understand |
|---|---|---|
| [Adapter](../src/main/java/dev/practice/patterns/structural/AdapterExample.java) | First | Translate an existing API into the interface your client expects. |
| [Decorator](../src/main/java/dev/practice/patterns/structural/DecoratorExample.java) | First | Compose extra behavior through the same interface. |
| [Proxy](../src/main/java/dev/practice/patterns/structural/ProxyExample.java) | First | Control access or loading through the same interface. |
| [Facade](../src/main/java/dev/practice/patterns/structural/FacadeExample.java) | First | Expose a small API over a multi-step subsystem. |
| [Composite](../src/main/java/dev/practice/patterns/structural/CompositeExample.java) | Next | Treat a nested group and a leaf uniformly. |
| [Bridge](../src/main/java/dev/practice/patterns/structural/BridgeExample.java) | Reference | Vary an abstraction and its implementation independently. |
| [Flyweight](../src/main/java/dev/practice/patterns/structural/FlyweightExample.java) | Reference | Share immutable repeated data; keep per-item state separate. |

## Behavioural

| Pattern / worked example | Priority | What to understand |
|---|---|---|
| [Strategy](../src/main/java/dev/practice/patterns/behavioural/StrategyExample.java) | First | Inject a replaceable policy. |
| [Observer](../src/main/java/dev/practice/patterns/behavioural/ObserverExample.java) | First | Notify registered listeners without coupling to concrete listeners. |
| [State](../src/main/java/dev/practice/patterns/behavioural/StateExample.java) | First | Move lifecycle behavior into state objects. |
| [ChainOfResponsibility](../src/main/java/dev/practice/patterns/behavioural/ChainOfResponsibilityExample.java) | First | Compose ordered handlers with a stopping rule. |
| [Command](../src/main/java/dev/practice/patterns/behavioural/CommandExample.java) | First | Represent an operation as an object that can enter history. |
| [TemplateMethod](../src/main/java/dev/practice/patterns/behavioural/TemplateMethodExample.java) | First | Fix workflow order while subclasses supply individual steps. |
| [Memento](../src/main/java/dev/practice/patterns/behavioural/MementoExample.java) | Next | Capture state for later restoration. |
| [Iterator](../src/main/java/dev/practice/patterns/behavioural/IteratorExample.java) | Reference | Traverse data without exposing its storage. |
| [Mediator](../src/main/java/dev/practice/patterns/behavioural/MediatorExample.java) | Reference | Centralize coordination between collaborating objects. |
| [Interpreter](../src/main/java/dev/practice/patterns/behavioural/InterpreterExample.java) | Reference | Evaluate a small grammar represented as expression objects. |
| [Visitor](../src/main/java/dev/practice/patterns/behavioural/VisitorExample.java) | Reference | Add operations over a stable family of element types. |

## Practical exercises

These are scoped slices of interview-style design tasks. They are deliberately smaller than a complete parking lot, brokerage or payment system. The tests check observable behavior; passing tests does **not** prove you chose a good design or implemented the named pattern. Review the design criteria after passing them.

| ID | Exercise | Patterns to practise | Budget |
|---|---|---|---|
| DP01 | [Parking-lot fee policies](../src/main/java/dev/practice/patterns/exercises/ParkingFees.java) | Strategy + simple factory | 45 min |
| DP02 | [Build validated immutable trade orders](../src/main/java/dev/practice/patterns/exercises/TradeOrderBuilder.java) | Builder | 45 min |
| DP03 | [Adapt and decorate a notification sender](../src/main/java/dev/practice/patterns/exercises/NotificationPipeline.java) | Adapter + Decorator | 45 min |
| DP04 | [Order lifecycle with valid transitions](../src/main/java/dev/practice/patterns/exercises/OrderLifecycle.java) | State | 45 min |
| DP05 | [Composable pre-trade validation chain](../src/main/java/dev/practice/patterns/exercises/TradeValidation.java) | Chain of Responsibility | 45 min |
| DP06 | [Market-price subscriptions](../src/main/java/dev/practice/patterns/exercises/PriceSubscriptions.java) | Observer | 45 min |
| DP07 | [Text editor with undo and redo](../src/main/java/dev/practice/patterns/exercises/UndoableEditor.java) | Command + Memento | 60 min |
| DP08 | [Reusable import workflow](../src/main/java/dev/practice/patterns/exercises/ImportWorkflow.java) | Template Method | 45 min |
| DP09 | [Authorized caching report proxy](../src/main/java/dev/practice/patterns/exercises/ReportProxy.java) | Proxy | 45 min |
| DP10 | [Aggregate nested portfolios](../src/main/java/dev/practice/patterns/exercises/PortfolioComposite.java) | Composite | 45 min |
| DP11 | [Checkout with compatible provider families](../src/main/java/dev/practice/patterns/exercises/CheckoutFacade.java) | Abstract Factory + Facade | 45 min |
| DP12 | [Copy a configured watchlist safely](../src/main/java/dev/practice/patterns/exercises/WatchlistPrototype.java) | Prototype | 30 min |

## Twelve-session learning path

Allow 60–90 minutes per session: 15 minutes tracing the example, 35–60 minutes implementing the exercise, then 10 minutes explaining design and tests. Read the brief and attempt the design before consulting the worked example. Revisit difficult exercises after two and seven days.

| Session | Read / run | Implement |
|---|---|---|
| 1 | Strategy, Factory Method; compare a simple factory | DP01 parking fees |
| 2 | Builder; discuss Singleton scope and injection | DP02 trade-order builder |
| 3 | Adapter, Decorator | DP03 notification pipeline |
| 4 | State | DP04 order lifecycle |
| 5 | Chain of Responsibility | DP05 trade validation |
| 6 | Observer | DP06 price subscriptions |
| 7 | Command, Memento | DP07 undoable editor |
| 8 | Template Method | DP08 import workflow |
| 9 | Proxy | DP09 report proxy |
| 10 | Composite; skim Visitor | DP10 portfolio aggregation |
| 11 | Abstract Factory, Facade | DP11 checkout facade |
| 12 | Prototype; skim Iterator, Bridge, Mediator, Flyweight, Interpreter | DP12 watchlist copy |

Then run two 60-minute mocks without consulting the pattern hints: extend parking pricing with new vehicle policies, and extend order processing with a new lifecycle operation. Spend the first ten minutes clarifying requirements. Review whether your design actually makes the requested change easier. Avoid adding patterns for requirements you were not given.

## Run

From the `DSA` folder:

```sh
# Compile everything, including unfinished exercises:
./mvnw -q -DskipTests test-compile
# Run a worked example:
java -cp target/classes dev.practice.patterns.creational.BuilderExample
# Work on one exercise at a time:
./mvnw -q -Dtest=ParkingFeesTest test
# Run the exercise track once you have implemented it:
./mvnw -q -Dgroups=design-patterns test
```

Use `mvnw.cmd` on Windows. The exercise tests intentionally fail until you implement the TODOs. Existing DSA and backend TODOs are also unfinished; running the full suite is not a green-build check yet.

## Interview questions to answer aloud

| Question | What a strong answer should cover |
|---|---|
| Strategy or State? | A caller selects a policy; lifecycle state governs valid actions and transitions. Similar delegation structure, different intent. |
| Factory Method, simple factory or Abstract Factory? | A subclass creation hook; a centralized lookup/creation function; or a related family of products. Do not label every static constructor Factory Method. |
| Builder or Prototype? | Assemble and validate a new value versus copy an existing configuration. Explain mutability and copying depth. |
| Adapter, Decorator, Proxy or Facade? | Interface translation, added behavior, access/lifecycle control, or a simplified subsystem API. Start with the intent, not the wrapper shape. |
| Template Method or Strategy? | Inheritance fixes an algorithm skeleton; composition swaps a collaborator. Explain which coupling you accept. |
| Observer or a message broker? | Local callbacks do not imply persistence, delivery guarantees or backpressure. Define exception and unsubscribe behavior. |
| Command or Memento for undo? | A command captures an action; a memento captures state. They can cooperate. Undoing remote side effects needs separate business rules. |
| Is Singleton thread-safe? | Safe instance publication does not make mutable fields safe. Scope is per defining classloader; it is not a distributed singleton. Prefer injected collaborators where practical. |
| Composite or Visitor? | Composite models a tree; Visitor adds operations across its element types. Adding element types makes Visitor maintenance more expensive. |
| When should you avoid a pattern? | When a small function, record or stable conditional is clearer and no relevant change pressure exists. |

## Design review after tests pass

- Demonstrate an added policy/handler/listener without editing the orchestrator, where that is the exercise goal.
- Explain ownership of mutable state, defensive copies and independent instances.
- Test an error path and an ordering rule, using injected fakes instead of sleeps or real services.
- Explain whether failures leave partial state, whether retries are safe, and how concurrency would change the contract.
- Keep the public API small; a large inheritance tree or many interfaces is not evidence of a better design.

## Sources and evidence

Reviewed 23 October 2026. These sources support pattern definitions and exercise selection; none supplies a reliable numerical probability that an interviewer will ask a particular pattern.

- [Refactoring.Guru catalog](https://refactoring.guru/design-patterns/catalog): creational, structural and behavioral grouping (its catalog omits Interpreter). The examples here are newly authored, not copied implementations.
- [Java Design Patterns: Interpreter](https://java-design-patterns.com/patterns/interpreter/): the remaining GoF pattern, included here as a small expression-tree example.
- [Builder](https://refactoring.guru/design-patterns/builder), [State](https://refactoring.guru/design-patterns/state), [Command](https://refactoring.guru/design-patterns/command), [Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility) and [Template Method](https://refactoring.guru/design-patterns/template-method): deeper explanations after your first attempt.
- [Ashish Pratap Singh's low-level-design interview resource](https://github.com/ashishps1/awesome-low-level-design): an educator's preparation collection that includes object-design scenarios such as parking lots and vending machines. It is not a verified employer question log.
- [ExperiencedDevs discussion of object-oriented coding interviews](https://www.reddit.com/r/ExperiencedDevs/comments/xo58t1/coding_interviews_with_oo_designs/): a candidate describes a parking-lot-style exercise and discussion of composition and object relationships. Anecdotal evidence, not a frequency survey.

The trading variants, public APIs, constraints, failure policies and tests in DP01–DP12 are authored practice material. Pattern names are suggested learning goals. In an interview, justify the simplest design that meets the actual requirements.
