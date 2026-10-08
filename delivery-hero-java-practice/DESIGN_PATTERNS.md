# Java design patterns — eight small worked examples

These are complete learning examples, separate from the unsolved interview exercises. Each Java file contains the explanation, pattern roles, tradeoff, runnable main method and expected output. They are teaching examples, not claims of exact Delivery Hero questions.

Creational patterns deal with object creation; structural patterns arrange objects/interfaces; behavioural patterns organize policies and communication.

## Creational

| Example | Idea |
|---|---|
| [FactoryMethodExample](src/main/java/dev/practice/patterns/creational/FactoryMethodExample.java) | Subclass chooses which notification channel to create. |
| [SingletonExample](src/main/java/dev/practice/patterns/creational/SingletonExample.java) | Access one immutable settings instance. |

## Structural

| Example | Idea |
|---|---|
| [AdapterExample](src/main/java/dev/practice/patterns/structural/AdapterExample.java) | Translate a legacy SMS API into your Notifier interface. |
| [DecoratorExample](src/main/java/dev/practice/patterns/structural/DecoratorExample.java) | Wrap coffee with independently composable extras. |
| [ProxyExample](src/main/java/dev/practice/patterns/structural/ProxyExample.java) | Check access before delegating to a report. |
| [FacadeExample](src/main/java/dev/practice/patterns/structural/FacadeExample.java) | Coordinate checkout behind one method. |

## Behavioural

| Example | Idea |
|---|---|
| [StrategyExample](src/main/java/dev/practice/patterns/behavioural/StrategyExample.java) | Inject regular or express delivery pricing. |
| [ObserverExample](src/main/java/dev/practice/patterns/behavioural/ObserverExample.java) | Notify subscribed listeners of order updates. |

## Run

In IntelliJ, open a file and run its main method. Or, from this Maven project folder:

```sh
./mvnw -q -DskipTests package
java -cp target/classes dev.practice.patterns.behavioural.StrategyExample
```

Replace the package/class with any example above. No framework or external service is required. The intentionally unfinished practice exercises do not need to pass for these examples to compile/run.

Suggested learning order: Strategy → Factory Method → Adapter → Decorator → Proxy → Facade → Observer → Singleton. Trace the main method, explain why the pattern helps, then attempt the small change in the comment without looking at the original implementation.

## Common interview distinctions

- Strategy chooses behavior; Factory Method delegates object creation to subclasses. A static method containing a type switch is a simple factory, not automatically the GoF Factory Method pattern.
- Adapter reconciles interfaces; Decorator adds behavior through the same interface; Proxy controls access through the same interface; Facade presents a simpler subsystem API.
- Observer here runs callbacks in the calling thread. It does not provide durable event delivery.
- Singleton controls instance creation, not thread safety of mutable state. Constructor injection is usually easier to test than global access.
