# Vala Keywords Reference Guide

Vala is a programming language that compiles to C and provides modern language features while maintaining compatibility with GObject and GTK. Here's a comprehensive guide to Vala's keywords:

## Core Language Keywords

### **class**
Defines a class in Vala's object-oriented programming model.

**Also used in:** C++, Java, C#, Python, JavaScript
**Purpose:** Creates a blueprint for objects with properties, methods, and inheritance capabilities
**Why used:** Enables object-oriented programming and code organization

```java
public class Person : GLib.Object {
    public string name { get; set; }
    public int age { get; set; }
    
    public Person(string name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### **interface**
Defines a contract that classes can implement.

**Also used in:** Java, C#, TypeScript, Go
**Purpose:** Specifies method signatures that implementing classes must provide
**Why used:** Enables multiple inheritance of type and polymorphism

```java
public interface Drawable {
    public abstract void draw();
    public abstract void resize(int width, int height);
}

public class Rectangle : Object, Drawable {
    public void draw() {
        // Implementation
    }
    
    public void resize(int width, int height) {
        // Implementation
    }
}
```

### **struct**
Defines a value type with fields and methods.

**Also used in:** C, C++, C#, Go, Rust
**Purpose:** Creates lightweight data containers
**Why used:** More efficient than classes for simple data structures

```java
public struct Point {
    public double x;
    public double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance_to(Point other) {
        return Math.sqrt((x - other.x) * (x - other.x) + 
                        (y - other.y) * (y - other.y));
    }
}
```

### **enum**
Defines an enumeration of named constants.

**Also used in:** C, C++, C#, Java, Rust, Swift
**Purpose:** Creates a set of named integer constants
**Why used:** Improves code readability and type safety

```java
public enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW
}

public enum Priority {
    LOW = 1,
    MEDIUM = 5,
    HIGH = 10
}
```

### **namespace**
Groups related classes, interfaces, and other types.

**Also used in:** C++, C#, PHP
**Purpose:** Organizes code and prevents naming conflicts
**Why used:** Creates logical groupings and avoids name collisions

```java
namespace MyApp.Utils {
    public class StringHelper {
        public static string reverse(string input) {
            // Implementation
        }
    }
}
```

## Access Modifiers

### **public**
Makes members accessible from anywhere.

**Also used in:** Java, C#, C++
**Purpose:** Provides unrestricted access to class members
**Why used:** Creates public APIs and interfaces

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

### **private**
Restricts access to the same class only.

**Also used in:** Java, C#, C++, Python
**Purpose:** Encapsulates implementation details
**Why used:** Maintains data integrity and hides internal logic

```java
public class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### **protected**
Allows access within the class and its subclasses.

**Also used in:** Java, C#, C++
**Purpose:** Provides controlled inheritance access
**Why used:** Enables subclass customization while maintaining encapsulation

```java
public class Animal {
    protected string species;
    
    protected void make_sound() {
        // Base implementation
    }
}

public class Dog : Animal {
    public Dog() {
        species = "Canine"; // Accessible due to protected
    }
}
```

### **internal**
Restricts access to the same package/assembly.

**Also used in:** C#
**Purpose:** Provides package-level access control
**Why used:** Allows collaboration between related classes while hiding from external code

```java
internal class DatabaseConnection {
    internal void connect() {
        // Implementation
    }
}
```

## Method and Property Modifiers

### **static**
Makes members belong to the type rather than instances.

**Also used in:** Java, C#, C++
**Purpose:** Creates class-level members
**Why used:** Provides utility functions and shared data

```java
public class MathUtils {
    public static double PI = 3.14159;
    
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
```

### **abstract**
Defines methods that must be implemented by subclasses.

**Also used in:** Java, C#, C++
**Purpose:** Creates incomplete base classes
**Why used:** Enforces implementation contracts in inheritance hierarchies

```java
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    
    public void display_info() {
        print("Area: %.2f, Perimeter: %.2f\n", area(), perimeter());
    }
}
```

### **virtual**
Allows methods to be overridden in subclasses.

**Also used in:** C#, C++
**Purpose:** Enables polymorphism through method overriding
**Why used:** Allows customization of behavior in inheritance

```java
public class Vehicle {
    public virtual void start() {
        print("Vehicle starting...\n");
    }
}

public class Car : Vehicle {
    public override void start() {
        print("Car engine starting...\n");
    }
}
```

### **override**
Provides a new implementation of a virtual method.

**Also used in:** C#, Java (with @Override annotation)
**Purpose:** Replaces inherited method behavior
**Why used:** Customizes inherited functionality

```java
public class ElectricCar : Vehicle {
    public override void start() {
        print("Electric motor starting silently...\n");
    }
}
```

## Control Flow Keywords

### **if**, **else**
Conditional execution statements.

**Also used in:** Most programming languages
**Purpose:** Controls program flow based on conditions
**Why used:** Implements decision-making logic

```java
public void check_age(int age) {
    if (age >= 18) {
        print("Adult\n");
    } else if (age >= 13) {
        print("Teenager\n");
    } else {
        print("Child\n");
    }
}
```

### **switch**, **case**, **default**
Multi-way conditional statements.

**Also used in:** C, C++, Java, C#, JavaScript
**Purpose:** Efficient multiple condition checking
**Why used:** Cleaner alternative to multiple if-else statements

```java
public void handle_grade(char grade) {
    switch (grade) {
        case 'A':
            print("Excellent!\n");
            break;
        case 'B':
            print("Good job!\n");
            break;
        case 'C':
            print("Average\n");
            break;
        default:
            print("Needs improvement\n");
            break;
    }
}
```

### **for**, **while**, **do**
Loop constructs for iteration.

**Also used in:** Most programming languages
**Purpose:** Repeats code execution
**Why used:** Automates repetitive tasks

```java
// For loop
for (int i = 0; i < 10; i++) {
    print("%d ", i);
}

// While loop
int count = 0;
while (count < 5) {
    print("Count: %d\n", count);
    count++;
}

// Do-while loop
int x = 0;
do {
    print("x = %d\n", x);
    x++;
} while (x < 3);
```

### **foreach**, **in**
Enhanced loop for collections.

**Also used in:** C#, Python (for...in), JavaScript (for...in)
**Purpose:** Iterates over collections without index management
**Why used:** Simplifies collection traversal

```java
string[] fruits = {"apple", "banana", "orange"};
foreach (string fruit in fruits) {
    print("Fruit: %s\n", fruit);
}

var numbers = new Gee.ArrayList<int>();
numbers.add(1);
numbers.add(2);
numbers.add(3);

foreach (int num in numbers) {
    print("Number: %d\n", num);
}
```

### **break**, **continue**
Loop control statements.

**Also used in:** Most programming languages
**Purpose:** Controls loop execution flow
**Why used:** Provides early exit or skip mechanisms

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        continue; // Skip iteration when i is 3
    }
    if (i == 7) {
        break; // Exit loop when i is 7
    }
    print("%d ", i);
}
```

### **return**
Returns a value from a method.

**Also used in:** Most programming languages
**Purpose:** Exits method and optionally returns a value
**Why used:** Provides method output and early exit

```java
public int multiply(int a, int b) {
    if (a == 0 || b == 0) {
        return 0; // Early return
    }
    return a * b;
}
```

## Exception Handling

### **try**, **catch**, **finally**, **throw**, **throws**
Exception handling mechanisms.

**Also used in:** Java, C#, JavaScript
**Purpose:** Handles runtime errors gracefully
**Why used:** Prevents program crashes and provides error recovery

```java
public void divide_numbers(double a, double b) throws MathError {
    try {
        if (b == 0) {
            throw new MathError.DIVISION_BY_ZERO("Cannot divide by zero");
        }
        double result = a / b;
        print("Result: %.2f\n", result);
    } catch (MathError e) {
        print("Math error: %s\n", e.message);
    } finally {
        print("Division operation completed\n");
    }
}

public errordomain MathError {
    DIVISION_BY_ZERO,
    INVALID_INPUT
}
```

## Memory Management

### **new**
Creates new object instances.

**Also used in:** C++, Java, C#, JavaScript
**Purpose:** Allocates memory for objects
**Why used:** Instantiates classes and allocates resources

```java
var person = new Person("John", 25);
var list = new Gee.ArrayList<string>();
var buffer = new uint8[1024]; // Array allocation
```

### **delete**
Explicitly deallocates memory (rarely used in Vala).

**Also used in:** C++
**Purpose:** Manual memory deallocation
**Why used:** Vala has automatic memory management, but delete is available for special cases

```java
// Rarely needed in Vala due to automatic memory management
// Used mainly with unowned references or manual memory management
```

## Type-related Keywords

### **var**
Automatic type inference.

**Also used in:** C#, JavaScript, TypeScript
**Purpose:** Lets compiler determine variable type
**Why used:** Reduces verbosity while maintaining type safety

```java
var name = "John"; // Inferred as string
var age = 25; // Inferred as int
var list = new Gee.ArrayList<string>(); // Inferred type
```

### **const**
Defines compile-time constants.

**Also used in:** C, C++, JavaScript
**Purpose:** Creates immutable values
**Why used:** Prevents accidental modification and enables optimizations

```java
public const int MAX_SIZE = 100;
public const string APP_NAME = "MyApplication";
public const double PI = 3.14159265359;
```

### **typeof**
Gets the type of an expression.

**Also used in:** C#, JavaScript, TypeScript
**Purpose:** Runtime type information
**Why used:** Enables reflection and type checking

```java
public void print_type(Object obj) {
    Type type = obj.get_type();
    print("Object type: %s\n", type.name());
}
```

### **is**
Type checking operator.

**Also used in:** C#, Python
**Purpose:** Checks if object is of specific type
**Why used:** Safe type checking before casting

```java
public void process_object(Object obj) {
    if (obj is Person) {
        var person = obj as Person;
        print("Person: %s\n", person.name);
    }
}
```

### **as**
Type casting operator.

**Also used in:** C#
**Purpose:** Safe type casting
**Why used:** Converts types with null return on failure

```java
Object obj = new Person("Alice", 30);
Person? person = obj as Person;
if (person != null) {
    print("Name: %s\n", person.name);
}
```

## Property Keywords

### **get**, **set**
Property accessor methods.

**Also used in:** C#
**Purpose:** Controls property access and modification
**Why used:** Encapsulates field access with custom logic

```java
public class Temperature {
    private double _celsius;
    
    public double celsius {
        get { return _celsius; }
        set { _celsius = value; }
    }
    
    public double fahrenheit {
        get { return _celsius * 9.0 / 5.0 + 32.0; }
        set { _celsius = (value - 32.0) * 5.0 / 9.0; }
    }
}
```

## Vala-specific Keywords

### **signal**
Defines signals for event-driven programming.

**Unique to:** Vala/GObject system
**Purpose:** Implements observer pattern
**Why used:** Enables loose coupling and event handling

```java
public class Button : Object {
    public signal void clicked(int x, int y);
    public signal void pressed();
    
    public void simulate_click(int x, int y) {
        clicked(x, y); // Emit signal
    }
}

// Usage
var button = new Button();
button.clicked.connect((x, y) => {
    print("Button clicked at (%d, %d)\n", x, y);
});
```

### **construct**
Constructor block that runs after all properties are set.

**Unique to:** Vala
**Purpose:** Post-construction initialization
**Why used:** Ensures all properties are available during initialization

```java
public class Widget : Object {
    public string name { get; set; }
    public int width { get; set; }
    public int height { get; set; }
    
    construct {
        // Runs after all properties are set
        if (name == null) {
            name = "Unnamed Widget";
        }
        print("Widget '%s' created with size %dx%d\n", name, width, height);
    }
}
```

### **owned**
Indicates ownership transfer of reference types.

**Unique to:** Vala
**Purpose:** Memory management and ownership semantics
**Why used:** Prevents memory leaks and clarifies ownership

```java
public owned string create_message(string name) {
    return "Hello, " + name + "!"; // Ownership transferred to caller
}

public void process_data() {
    owned string[] items = get_items(); // Takes ownership
    // items will be automatically freed when out of scope
}
```

### **unowned**
Indicates a weak reference without ownership.

**Unique to:** Vala
**Purpose:** Prevents circular references and memory leaks
**Why used:** Breaks reference cycles in object graphs

```java
public class Parent : Object {
    public Child child { get; set; }
}

public class Child : Object {
    public unowned Parent parent { get; set; } // Weak reference
}
```

### **weak**
Similar to unowned but can become null automatically.

**Unique to:** Vala
**Purpose:** Automatic weak reference management
**Why used:** Prevents dangling pointers

```java
public class Observer : Object {
    public weak Subject? subject; // Automatically becomes null if subject is destroyed
}
```

### **async**, **yield**
Asynchronous programming support.

**Also used in:** C# (async/await), JavaScript (async/await), Python (async/await)
**Purpose:** Non-blocking asynchronous operations
**Why used:** Improves responsiveness and enables concurrent programming

```java
public async void download_file(string url) {
    try {
        var session = new Soup.Session();
        var message = new Soup.Message("GET", url);
        
        yield session.send_async(message, null);
        print("Download completed\n");
    } catch (Error e) {
        print("Download failed: %s\n", e.message);
    }
}

// Usage
download_file.begin("https://example.com/file.txt");
```

## GTK4 Integration Keywords

When working with GTK4, Vala provides seamless integration:

### **[GtkTemplate]**
Attribute for GTK template integration.

```java
[GtkTemplate (ui = "/com/example/window.ui")]
public class MainWindow : Gtk.ApplicationWindow {
    [GtkChild]
    private unowned Gtk.Button my_button;
    
    [GtkCallback]
    private void on_button_clicked() {
        print("Button clicked!\n");
    }
}
```

### **[GtkChild]**
Binds UI elements from templates.

```java
[GtkTemplate (ui = "/com/example/dialog.ui")]
public class PreferencesDialog : Gtk.Dialog {
    [GtkChild]
    private unowned Gtk.Entry name_entry;
    
    [GtkChild]
    private unowned Gtk.SpinButton age_spin;
}
```

### **[GtkCallback]**
Connects template callbacks to methods.

```java
[GtkTemplate (ui = "/com/example/widget.ui")]
public class CustomWidget : Gtk.Box {
    [GtkCallback]
    private void on_save_clicked() {
        // Handle save action
    }
    
    [GtkCallback]
    private void on_cancel_clicked() {
        // Handle cancel action
    }
}
```

### **delegate**
Defines function pointer types for callback mechanisms.

**Also used in:** C#
**Purpose:** Creates type-safe function pointers
**Why used:** Enables callback patterns and functional programming concepts

```java
public delegate void EventHandler(string message);
public delegate int Calculator(int a, int b);

public class EventManager {
    public EventHandler? on_event;
    
    public void trigger_event(string msg) {
        if (on_event != null) {
            on_event(msg);
        }
    }
}

// Usage
var manager = new EventManager();
manager.on_event = (msg) => {
    print("Event received: %s\n", msg);
};

Calculator add = (a, b) => a + b;
Calculator multiply = (a, b) => a * b;
```

### **errordomain**
Defines custom error types for exception handling.

**Unique to:** Vala
**Purpose:** Creates structured error hierarchies
**Why used:** Provides type-safe error handling with specific error codes

```java
public errordomain FileError {
    NOT_FOUND,
    PERMISSION_DENIED,
    CORRUPTED,
    TOO_LARGE
}

public errordomain NetworkError {
    CONNECTION_FAILED,
    TIMEOUT,
    INVALID_RESPONSE
}

public void read_file(string path) throws FileError {
    if (!FileUtils.test(path, FileTest.EXISTS)) {
        throw new FileError.NOT_FOUND("File not found: %s", path);
    }
    // File reading logic
}
```

### **ensures**, **requires**
Contract programming constructs for method preconditions and postconditions.

**Also used in:** Eiffel, Spec# (similar concepts)
**Purpose:** Documents and enforces method contracts
**Why used:** Improves code reliability and documentation

```java
public class BankAccount {
    private double balance;
    
    public void withdraw(double amount) 
        requires (amount > 0)
        requires (amount <= balance)
        ensures (balance >= 0)
    {
        balance -= amount;
    }
    
    public double get_balance()
        ensures (result >= 0)
    {
        return balance;
    }
}
```

### **extern**
Declares external functions or variables from C libraries.

**Also used in:** C, C++
**Purpose:** Interfaces with C code and libraries
**Why used:** Enables integration with existing C libraries

```java
// Declaring external C functions
extern void c_function(int param);
extern int external_variable;

// Using external libraries
[CCode (cheader_filename = "math.h")]
extern double sin(double x);
[CCode (cheader_filename = "math.h")]
extern double cos(double x);

public void use_external() {
    double result = sin(3.14159 / 2);
    print("sin(π/2) = %f\n", result);
}
```

### **inline**
Suggests the compiler to inline function calls for performance.

**Also used in:** C++, C
**Purpose:** Optimization hint for small functions
**Why used:** Reduces function call overhead

```java
public class MathUtils {
    public static inline int square(int x) {
        return x * x;
    }
    
    public static inline double max(double a, double b) {
        return a > b ? a : b;
    }
}
```

### **lock**
Provides thread synchronization for concurrent programming.

**Also used in:** C#
**Purpose:** Ensures thread-safe access to shared resources
**Why used:** Prevents race conditions in multithreaded applications

```java
public class ThreadSafeCounter {
    private int count = 0;
    private Mutex mutex = Mutex();
    
    public void increment() {
        lock (mutex) {
            count++;
        }
    }
    
    public int get_count() {
        lock (mutex) {
            return count;
        }
    }
}
```

### **out**, **ref**
Parameter passing modifiers for reference semantics.

**Also used in:** C#
**Purpose:** Enables methods to modify caller's variables
**Why used:** Allows multiple return values and reference parameter passing

```java
public void divide_with_remainder(int dividend, int divisor, 
                                 out int quotient, out int remainder) {
    quotient = dividend / divisor;
    remainder = dividend % divisor;
}

public void modify_value(ref int value) {
    value *= 2;
}

// Usage
int q, r;
divide_with_remainder(17, 5, out q, out r);
print("17 ÷ 5 = %d remainder %d\n", q, r);

int num = 10;
modify_value(ref num);
print("Modified value: %d\n", num); // Prints 20
```

### **params**
Allows variable number of arguments (variadic functions).

**Also used in:** C#
**Purpose:** Accepts variable number of parameters
**Why used:** Creates flexible APIs with optional parameters

```java
public void print_numbers(params int[] numbers) {
    foreach (int num in numbers) {
        print("%d ", num);
    }
    print("\n");
}

// Usage
print_numbers(1, 2, 3);
print_numbers(10, 20, 30, 40, 50);
```

### **sealed**
Prevents further inheritance of classes.

**Also used in:** C#, Java (final)
**Purpose:** Restricts class inheritance
**Why used:** Ensures class design integrity and enables optimizations

```java
public sealed class FinalClass : BaseClass {
    public void final_method() {
        print("This class cannot be inherited\n");
    }
}

// This would cause a compilation error:
// public class CannotInherit : FinalClass { }
```

### **sizeof**
Returns the size of a type in bytes.

**Also used in:** C, C++
**Purpose:** Gets memory size of types
**Why used:** Low-level memory operations and buffer allocation

```java
public void show_sizes() {
    print("int size: %zu bytes\n", sizeof(int));
    print("double size: %zu bytes\n", sizeof(double));
    print("pointer size: %zu bytes\n", sizeof(void*));
}
```

### **this**
References the current object instance.

**Also used in:** Java, C#, C++, JavaScript
**Purpose:** Refers to current object
**Why used:** Disambiguates between parameters and fields, enables method chaining

```java
public class Person {
    private string name;
    private int age;
    
    public Person set_name(string name) {
        this.name = name; // Disambiguate parameter from field
        return this; // Enable method chaining
    }
    
    public Person set_age(int age) {
        this.age = age;
        return this;
    }
}

// Method chaining usage
var person = new Person()
    .set_name("Alice")
    .set_age(25);
```

### **base**
References the parent class implementation.

**Also used in:** C# (similar to super in Java)
**Purpose:** Calls parent class methods and constructors
**Why used:** Extends parent functionality rather than replacing it

```java
public class Animal {
    protected string species;
    
    public Animal(string species) {
        this.species = species;
    }
    
    public virtual void make_sound() {
        print("%s makes a sound\n", species);
    }
}

public class Dog : Animal {
    public Dog() {
        base("Canine"); // Call parent constructor
    }
    
    public override void make_sound() {
        base.make_sound(); // Call parent method
        print("Woof!\n");
    }
}
```

### **null**
Represents null reference value.

**Also used in:** Most programming languages
**Purpose:** Indicates absence of object reference
**Why used:** Represents uninitialized or empty references

```java
public class NullExample {
    public string? nullable_string = null;
    
    public void check_null() {
        if (nullable_string == null) {
            print("String is null\n");
        } else {
            print("String value: %s\n", nullable_string);
        }
    }
}
```

### **true**, **false**
Boolean literal values.

**Also used in:** Most programming languages
**Purpose:** Represents boolean values
**Why used:** Logical operations and conditional expressions

```java
public class BooleanExample {
    public bool is_active = true;
    public bool is_disabled = false;
    
    public bool check_status() {
        return is_active && !is_disabled;
    }
}
```

## Advanced Language Constructs

### **with**
Simplifies object initialization with property setting.

**Unique to:** Vala (similar concepts in other languages)
**Purpose:** Streamlines object creation and property assignment
**Why used:** Reduces boilerplate code for object initialization

```java
public class Configuration {
    public string host { get; set; }
    public int port { get; set; }
    public bool ssl_enabled { get; set; }
    public string username { get; set; }
}

// Using 'with' for clean initialization
var config = new Configuration() {
    host = "localhost",
    port = 8080,
    ssl_enabled = true,
    username = "admin"
};
```

### **value**
Used in property setters to refer to the assigned value.

**Also used in:** C#
**Purpose:** Represents the value being assigned to a property
**Why used:** Enables custom logic in property setters

```java
public class Temperature {
    private double _celsius;
    
    public double celsius {
        get { return _celsius; }
        set {
            if (value < -273.15) {
                warning("Temperature below absolute zero!");
                _celsius = -273.15;
            } else {
                _celsius = value;
            }
        }
    }
}
```

### **global**
Accesses global namespace when there are naming conflicts.

**Unique to:** Vala
**Purpose:** Resolves namespace ambiguity
**Why used:** Accesses global symbols when local names conflict

```java
namespace MyApp {
    public class File {
        public void process() {
            // Access global GLib.File when local File class exists
            global::GLib.File file = global::GLib.File.new_for_path("/tmp/test");
        }
    }
}
```

## Memory Management Keywords

### **[Compact]**
Attribute for creating compact classes without GObject overhead.

**Unique to:** Vala
**Purpose:** Creates lightweight classes
**Why used:** Reduces memory overhead for simple data structures

```java
[Compact]
public class LightweightNode {
    public string data;
    public LightweightNode? next;
    
    public LightweightNode(string data) {
        this.data = data;
    }
}
```

### **[Immutable]**
Attribute marking classes as immutable.

**Unique to:** Vala
**Purpose:** Ensures object immutability
**Why used:** Thread safety and functional programming patterns

```java
[Immutable]
public class Point {
    public double x { get; private set; }
    public double y { get; private set; }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point translate(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }
}
```

## Preprocessor Directives

### **#if**, **#else**, **#elif**, **#endif**
Conditional compilation directives.

**Also used in:** C, C#
**Purpose:** Conditional code compilation
**Why used:** Platform-specific code and debug builds

```java
public class PlatformSpecific {
    public void show_platform() {
        #if LINUX
        print("Running on Linux\n");
        #elif WINDOWS
        print("Running on Windows\n");
        #else
        print("Running on unknown platform\n");
        #endif
    }
    
    public void debug_info() {
        #if DEBUG
        print("Debug mode enabled\n");
        print("Memory usage: %zu bytes\n", get_memory_usage());
        #endif
    }
}
```

### **#warning**, **#error**
Compiler diagnostic directives.

**Also used in:** C, C#
**Purpose:** Generate compiler warnings or errors
**Why used:** Code documentation and preventing compilation under certain conditions

```java
#if DEPRECATED_API
#warning "Using deprecated API - please update your code"
#endif

#if UNSUPPORTED_PLATFORM
#error "This platform is not supported"
#endif
```

### Library Integration Examples
```java
// JSON handling with Json-GLib
using Json;

public class JsonExample {
    public void parse_json(string json_string) {
        try {
            var parser = new Json.Parser();
            parser.load_from_data(json_string);
            
            var root = parser.get_root().get_object();
            var name = root.get_string_member("name");
            print("Name: %s\n", name);
        } catch (Error e) {
            print("JSON parsing error: %s\n", e.message);
        }
    }
}

// Database integration with SQLite
public class DatabaseExample {
    private Sqlite.Database db;
    
    public void connect() throws DatabaseError {
        int result = Sqlite.Database.open("example.db", out db);
        if (result != Sqlite.OK) {
            throw new DatabaseError.CONNECTION_FAILED("Cannot open database");
        }
    }
    
    public void create_table() {
        string sql = """
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY,
                name TEXT NOT NULL,
                email TEXT UNIQUE
            )
        """;
        
        db.exec(sql);
    }
}
```

### **void**
Represents the absence of a return type.

**Also used in:** C, C++, Java, C#
**Purpose:** Indicates methods that don't return a value
**Why used:** Defines procedures rather than functions

```java
public void print_message(string message) {
    print("%s\n", message);
    // No return statement needed
}

public void* get_raw_pointer() {
    // Returns generic pointer
    return malloc(sizeof(int));
}
```

### **volatile**
Indicates that a variable may be changed by external factors.

**Also used in:** C, C++, Java
**Purpose:** Prevents compiler optimizations on variable access
**Why used:** Hardware registers, signal handlers, multi-threading

```java
public class HardwareInterface {
    private volatile uint32 status_register;
    private volatile bool interrupt_flag;
    
    public void check_hardware() {
        while (!interrupt_flag) {
            // Compiler won't optimize this loop
            Thread.usleep(1000);
        }
    }
}
```

### **goto**
Unconditional jump to a labeled statement.

**Also used in:** C, C++, C#
**Purpose:** Direct control flow transfer
**Why used:** Error handling, breaking out of nested loops (discouraged in modern code)

```java
public void complex_parsing(string input) {
    for (int i = 0; i < input.length; i++) {
        for (int j = 0; j < input.length; j++) {
            if (input[i] == input[j] && i != j) {
                goto found_duplicate;
            }
        }
    }
    print("No duplicates found\n");
    return;
    
    found_duplicate:
    print("Duplicate characters found\n");
}
```

### **namespace** (global scope)
The implicit global namespace.

**Also used in:** C++, C#
**Purpose:** Default namespace for all declarations
**Why used:** Organizing code at the top level

```java
// Global namespace declarations
public const string VERSION = "1.0.0";
public enum LogLevel { DEBUG, INFO, WARNING, ERROR }

namespace App {
    // Nested namespace
    public class Logger {
        public static void log(LogLevel level, string message) {
            print("[%s] %s\n", level.to_string(), message);
        }
    }
}
```

### **using**
Imports namespaces or creates aliases.

**Also used in:** C#, C++ (using namespace)
**Purpose:** Simplifies type names and creates aliases
**Why used:** Reduces verbosity and resolves naming conflicts

```java
using GLib;
using Gtk;
using Gee;

// Type aliases
using StringList = Gee.ArrayList<string>;
using IntMap = Gee.HashMap<string, int>;

public class UsingExample {
    private StringList items;
    private IntMap counters;
    
    public UsingExample() {
        items = new StringList();
        counters = new IntMap();
    }
}
```

### **lambda expressions** (=>, anonymous functions)
Anonymous function syntax for delegates and callbacks.

**Also used in:** C#, Java, JavaScript, Python
**Purpose:** Creates inline anonymous functions
**Why used:** Simplifies callback code and functional programming

```java
public class LambdaExample {
    public void demonstrate_lambdas() {
        var numbers = new Gee.ArrayList<int>();
        numbers.add_all_array({1, 2, 3, 4, 5});
        
        // Simple lambda
        numbers.foreach((item) => {
            print("Number: %d\n", item);
        });
        
        // Lambda with multiple parameters
        var calculator = new Calculator();
        calculator.operation = (a, b) => a + b;
        
        // Lambda with capture
        int multiplier = 10;
        var transform = (int x) => x * multiplier;
        
        // Method reference as lambda
        var printer = print;
    }
}

public delegate int BinaryOperation(int a, int b);

public class Calculator {
    public BinaryOperation operation;
    
    public int calculate(int a, int b) {
        return operation(a, b);
    }
}
```

### **generic constraints** (where clause equivalent)
Type parameter constraints for generics.

**Also used in:** C#, Java (bounded type parameters)
**Purpose:** Restricts generic type parameters
**Why used:** Ensures type safety and enables specific operations

```java
// Generic class with constraints
public class Repository<T> : Object where T : Object {
    private Gee.List<T> items;
    
    public Repository() {
        items = new Gee.ArrayList<T>();
    }
    
    public void add(T item) {
        items.add(item);
    }
    
    public T? find_by_property(string property_name, Value value) {
        foreach (T item in items) {
            Value item_value;
            item.get_property(property_name, out item_value);
            if (item_value.equals(value)) {
                return item;
            }
        }
        return null;
    }
}

// Generic method with constraints
public T clone_object<T>(T original) where T : Object {
    // Can use Object methods because of constraint
    return Object.new(original.get_type()) as T;
}
```

### **[CCode]** attribute family
Attributes for C code integration and code generation control.

**Unique to:** Vala
**Purpose:** Controls C code generation and integration
**Why used:** Fine-grained control over C interop and optimization

```java
// C function binding
[CCode (cname = "custom_c_function")]
public extern void call_c_function(int param);

// Custom C name for generated function
[CCode (cname = "my_custom_name")]
public void vala_function() {
    print("This will be named 'my_custom_name' in C\n");
}

// Include specific headers
[CCode (cheader_filename = "custom.h")]
public extern int external_variable;

// Array length parameter control
[CCode (array_length_pos = 1.5)]
public void process_array([CCode (array_length_pos = 1.1)] uint8[] data) {
    // Custom array length parameter positioning
}

// Disable array length parameter
[CCode (array_length = false)]
public void process_raw_array(uint8[] data) {
    // No length parameter generated
}

// Custom instance parameter name
[CCode (instance_pos = 2.1)]
public void method_with_custom_instance_pos(int first_param) {
    // Instance parameter positioned after first_param
}
```

### **[Version]** attribute
Marks API version information for deprecation and availability.

**Unique to:** Vala
**Purpose:** API versioning and deprecation management
**Why used:** Maintains backward compatibility and guides API evolution

```java
public class VersionedAPI {
    [Version (since = "1.0")]
    public void stable_method() {
        print("Available since version 1.0\n");
    }
    
    [Version (deprecated = true, deprecated_since = "2.0", 
              replacement = "new_method")]
    public void old_method() {
        print("This method is deprecated\n");
    }
    
    [Version (since = "2.0")]
    public void new_method() {
        print("Replacement for old_method\n");
    }
    
    [Version (experimental = true)]
    public void experimental_feature() {
        print("This API may change in future versions\n");
    }
}
```

### **[NoReturn]** attribute
Indicates that a function never returns normally.

**Unique to:** Vala (similar to [[noreturn]] in C++)
**Purpose:** Optimization hint and static analysis
**Why used:** Helps compiler optimize and detect unreachable code

```java
[NoReturn]
public void fatal_error(string message) {
    print("Fatal error: %s\n", message);
    Process.exit(1);
}

[NoReturn]
public void infinite_loop() {
    while (true) {
        Thread.usleep(1000000);
    }
}
```

### **[PrintfFormat]** and **[ScanfFormat]** attributes
Enables format string checking for printf-style functions.

**Unique to:** Vala
**Purpose:** Compile-time format string validation
**Why used:** Prevents format string bugs and improves type safety

```java
public class FormattedOutput {
    [PrintfFormat]
    public static void debug_print(string format, ...) {
        var args = va_list();
        print("[DEBUG] ");
        vprintf(format, args);
    }
    
    [PrintfFormat]
    public static string format_string(string format, ...) {
        var args = va_list();
        return format.vprintf(args);
    }
}

// Usage with compile-time checking
FormattedOutput.debug_print("User %s has %d points\n", "Alice", 100);
```

### **[SimpleType]** attribute
Marks structs as simple value types.

**Unique to:** Vala
**Purpose:** Optimization for simple value types
**Why used:** Reduces overhead for basic data structures

```java
[SimpleType]
public struct Color {
    public uint8 red;
    public uint8 green;
    public uint8 blue;
    public uint8 alpha;
    
    public Color(uint8 r, uint8 g, uint8 b, uint8 a = 255) {
        red = r;
        green = g;
        blue = b;
        alpha = a;
    }
    
    public uint32 to_rgba() {
        return (red << 24) | (green << 16) | (blue << 8) | alpha;
    }
}
```

### **[Flags]** attribute
Marks enums as bit flags for bitwise operations.

**Unique to:** Vala
**Purpose:** Enables bitwise operations on enums
**Why used:** Creates flag enumerations for options and permissions

```java
[Flags]
public enum FilePermissions {
    READ = 1,
    WRITE = 2,
    EXECUTE = 4,
    DELETE = 8
}

public class FileManager {
    public void set_permissions(string path, FilePermissions perms) {
        if (FilePermissions.READ in perms) {
            print("Read permission granted\n");
        }
        if (FilePermissions.WRITE in perms) {
            print("Write permission granted\n");
        }
    }
}

// Usage
var perms = FilePermissions.READ | FilePermissions.WRITE;
var manager = new FileManager();
manager.set_permissions("/tmp/file", perms);
```

### **[DBus]** attribute family
Attributes for D-Bus service integration.

**Unique to:** Vala
**Purpose:** D-Bus service and client generation
**Why used:** Inter-process communication and system service integration

```java
[DBus (name = "org.example.Calculator")]
public interface CalculatorService : Object {
    public abstract int add(int a, int b) throws IOError;
    public abstract int multiply(int a, int b) throws IOError;
    
    public signal void calculation_completed(int result);
}

[DBus (name = "org.example.Calculator")]
public class CalculatorImpl : Object, CalculatorService {
    public int add(int a, int b) throws IOError {
        int result = a + b;
        calculation_completed(result);
        return result;
    }
    
    public int multiply(int a, int b) throws IOError {
        int result = a * b;
        calculation_completed(result);
        return result;
    }
}
```

### **[GIR]** attribute
Controls GObject Introspection metadata generation.

**Unique to:** Vala
**Purpose:** GObject Introspection integration
**Why used:** Enables language bindings and runtime introspection

```java
[GIR (name = "CustomWidget")]
public class MyWidget : Gtk.Widget {
    [GIR (name = "set_custom_property")]
    public void set_property_value(string value) {
        // Implementation
    }
    
    [GIR (skip = true)]
    private void internal_method() {
        // This won't appear in GIR
    }
}
```

### **in** (containment operator)
Tests membership in collections or ranges.

**Also used in:** Python, JavaScript
**Purpose:** Checks if element exists in collection
**Why used:** Simplifies containment testing

```java
public void test_containment() {
    var list = new Gee.ArrayList<string>();
    list.add("apple");
    list.add("banana");
    
    if ("apple" in list) {
        print("Found apple\n");
    }
    
    // Range testing
    int value = 5;
    if (value in 1...10) {
        print("Value is between 1 and 10\n");
    }
}
```

### **...** (range operator)
Creates ranges for iteration and testing.

**Also used in:** Swift, Rust
**Purpose:** Defines inclusive ranges
**Why used:** Simplifies range operations

```java
public void demonstrate_ranges() {
    // Inclusive range
    foreach (int i in 1...5) {
        print("%d ", i); // Prints: 1 2 3 4 5
    }
    
    // Range in switch
    int score = 85;
    switch (score) {
        case 90...100:
            print("Grade A\n");
            break;
        case 80...89:
            print("Grade B\n");
            break;
        case 70...79:
            print("Grade C\n");
            break;
        default:
            print("Grade F\n");
            break;
    }
}
```

### **dynamic**
Enables dynamic typing and late binding.

**Also used in:** C#, JavaScript
**Purpose:** Runtime type resolution and dynamic method calls
**Why used:** Interoperability with dynamic languages and flexible APIs

```java
public class DynamicExample {
    public void use_dynamic() {
        dynamic obj = get_dynamic_object();
        
        // Dynamic method calls resolved at runtime
        obj.some_method();
        obj.property = "value";
        
        // Type checking at runtime
        if (obj is string) {
            string str = (string) obj;
            print("String value: %s\n", str);
        }
    }
    
    private dynamic get_dynamic_object() {
        // Return different types based on conditions
        return "dynamic string";
    }
}
```

### **yield** (iterator context)
Creates iterator methods for custom iteration patterns.

**Also used in:** C#, Python, JavaScript
**Purpose:** Creates custom iterators and generators
**Why used:** Memory-efficient iteration over large datasets

```java
public class IteratorExample {
    public Iterator<int> fibonacci_sequence(int count) {
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            yield a;
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    
    public Iterator<string> read_lines(string filename) {
        try {
            var file = File.new_for_path(filename);
            var stream = file.read();
            var data_stream = new DataInputStream(stream);
            
            string line;
            while ((line = data_stream.read_line()) != null) {
                yield line;
            }
        } catch (Error e) {
            warning("Error reading file: %s", e.message);
        }
    }
}

// Usage
var example = new IteratorExample();
foreach (int fib in example.fibonacci_sequence(10)) {
    print("%d ", fib);
}
```

### **fixed**
Creates fixed-size arrays and unsafe memory blocks.

**Also used in:** C#
**Purpose:** Fixed-size memory allocation
**Why used:** Performance-critical code and C interoperability

```java
public class FixedExample {
    // Fixed-size array
    private fixed char buffer[256];
    
    public void use_fixed_buffer() {
        // Direct memory access
        buffer[0] = 'H';
        buffer[1] = 'i';
        buffer[2] = '\0';
        
        print("Buffer content: %s\n", (string) buffer);
    }
    
    public void process_fixed_data() {
        fixed (char* ptr = buffer) {
            // Unsafe pointer operations
            Memory.set(ptr, 0, 256);
            Memory.copy(ptr, "Hello", 5);
        }
    }
}
```

### **stackalloc**
Allocates memory on the stack for temporary arrays.

**Also used in:** C#
**Purpose:** Stack-based memory allocation
**Why used:** Performance optimization for temporary data

```java
public class StackAllocExample {
    public void process_temporary_data() {
        // Allocate temporary array on stack
        int* temp_array = stackalloc int[100];
        
        // Initialize and use
        for (int i = 0; i < 100; i++) {
            temp_array[i] = i * i;
        }
        
        // Memory automatically freed when scope ends
        print("Temporary processing complete\n");
    }
}
```

### **checked**, **unchecked**
Controls arithmetic overflow checking.

**Also used in:** C#
**Purpose:** Overflow detection control
**Why used:** Performance vs. safety trade-offs

```java
public class OverflowExample {
    public void demonstrate_overflow() {
        int max_int = int.MAX;
        
        try {
            checked {
                int result = max_int + 1; // Throws overflow exception
                print("Result: %d\n", result);
            }
        } catch (ArithmeticError e) {
            print("Overflow detected: %s\n", e.message);
        }
        
        unchecked {
            int result = max_int + 1; // Wraps around silently
            print("Unchecked result: %d\n", result);
        }
    }
}
```

### **operator**
Defines custom operators for classes and structs.

**Also used in:** C++, C#
**Purpose:** Operator overloading
**Why used:** Natural syntax for custom types

```java
public struct Vector {
    public double x;
    public double y;
    
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Addition operator
    public static Vector operator +(Vector a, Vector b) {
        return Vector(a.x + b.x, a.y + b.y);
    }
    
    // Subtraction operator
    public static Vector operator -(Vector a, Vector b) {
        return Vector(a.x - b.x, a.y - b.y);
    }
    
    // Scalar multiplication
    public static Vector operator *(Vector v, double scalar) {
        return Vector(v.x * scalar, v.y * scalar);
    }
    
    // Equality operator
    public static bool operator ==(Vector a, Vector b) {
        return a.x == b.x && a.y == b.y;
    }
    
    // Inequality operator
    public static bool operator !=(Vector a, Vector b) {
        return !(a == b);
    }
}

// Usage
Vector v1 = Vector(1.0, 2.0);
Vector v2 = Vector(3.0, 4.0);
Vector sum = v1 + v2;
Vector scaled = v1 * 2.0;
```

### **implicit**, **explicit**
Defines type conversion operators.

**Also used in:** C#
**Purpose:** Custom type conversions
**Why used:** Natural type conversion syntax

```java
public struct Temperature {
    public double celsius;
    
    public Temperature(double celsius) {
        this.celsius = celsius;
    }
    
    // Implicit conversion from double
    public static implicit operator Temperature(double celsius) {
        return Temperature(celsius);
    }
    
    // Explicit conversion to double
    public static explicit operator double(Temperature temp) {
        return temp.celsius;
    }
    
    // Implicit conversion to string
    public static implicit operator string(Temperature temp) {
        return "%.1f°C".printf(temp.celsius);
    }
}

// Usage
Temperature temp = 25.5; // Implicit conversion from double
double value = (double) temp; // Explicit conversion to double
string display = temp; // Implicit conversion to string
```

### **partial**
Allows splitting class definitions across multiple files.

**Also used in:** C#
**Purpose:** Code organization and code generation
**Why used:** Separating generated code from user code

```java
// File: Person.vala
public partial class Person {
    public string first_name { get; set; }
    public string last_name { get; set; }
    
    public string get_full_name() {
        return "%s %s".printf(first_name, last_name);
    }
}

// File: Person.Generated.vala
public partial class Person {
    // Generated properties and methods
    public int id { get; set; }
    public DateTime created_at { get; set; }
    
    public void save_to_database() {
        // Generated database code
    }
}
```

### **event**
Declares events for publisher-subscriber patterns.

**Also used in:** C#
**Purpose:** Type-safe event handling
**Why used:** Decoupled communication between objects

```java
public class Publisher {
    // Event declaration
    public event EventHandler<string> message_received;
    public event EventHandler<int> value_changed;
    
    private int _value;
    public int value {
        get { return _value; }
        set {
            if (_value != value) {
                _value = value;
                value_changed(this, value); // Raise event
            }
        }
    }
    
    public void simulate_message(string msg) {
        message_received(this, msg); // Raise event
    }
}

public delegate void EventHandler<T>(Object sender, T args);

// Usage
var publisher = new Publisher();
publisher.message_received += (sender, msg) => {
    print("Message: %s\n", msg);
};
publisher.value_changed += (sender, val) => {
    print("Value changed to: %d\n", val);
};
```

### **add**, **remove** (event accessors)
Custom event accessor methods.

**Also used in:** C#
**Purpose:** Custom event subscription logic
**Why used:** Control over event subscription behavior

```java
public class CustomEventPublisher {
    private Gee.List<EventHandler<string>> handlers;
    
    public CustomEventPublisher() {
        handlers = new Gee.ArrayList<EventHandler<string>>();
    }
    
    public event EventHandler<string> custom_event {
        add {
            handlers.add(value);
            print("Handler added, total: %d\n", handlers.size);
        }
        remove {
            handlers.remove(value);
            print("Handler removed, total: %d\n", handlers.size);
        }
    }
    
    public void raise_event(string message) {
        foreach (var handler in handlers) {
            handler(this, message);
        }
    }
}
```

### **where** (generic constraints)
Specifies constraints on generic type parameters.

**Also used in:** C#
**Purpose:** Generic type constraints
**Why used:** Ensures generic types meet specific requirements

```java
// Interface constraint
public class Repository<T> where T : Object, Comparable<T> {
    private Gee.List<T> items;
    
    public Repository() {
        items = new Gee.ArrayList<T>();
    }
    
    public void add_sorted(T item) {
        int index = 0;
        foreach (T existing in items) {
            if (item.compare_to(existing) <= 0) {
                break;
            }
            index++;
        }
        items.insert(index, item);
    }
}

// Multiple constraints
public class Cache<TKey, TValue> 
    where TKey : Object, Hashable<TKey>
    where TValue : Object {
    
    private Gee.Map<TKey, TValue> storage;
    
    public Cache() {
        storage = new Gee.HashMap<TKey, TValue>();
    }
    
    public void store(TKey key, TValue value) {
        storage[key] = value;
    }
    
    public TValue? retrieve(TKey key) {
        return storage[key];
    }
}
```

### **nameof**
Gets the string name of a variable, type, or member.

**Also used in:** C#
**Purpose:** Compile-time name resolution
**Why used:** Refactoring-safe string literals

```java
public class NameofExample {
    public string property_name { get; set; }
    
    public void demonstrate_nameof() {
        string var_name = "test";
        
        print("Variable name: %s\n", nameof(var_name));
        print("Property name: %s\n", nameof(property_name));
        print("Class name: %s\n", nameof(NameofExample));
        print("Method name: %s\n", nameof(demonstrate_nameof));
    }
    
    public void validate_property(string property_value) {
        if (property_value == null) {
            throw new ArgumentError.NULL_POINTER(
                "Parameter %s cannot be null", nameof(property_value));
        }
    }
}
```

### **default**
Gets the default value for a type.

**Also used in:** C#
**Purpose:** Type-safe default value retrieval
**Why used:** Generic programming with unknown types

```java
public class DefaultExample<T> {
    public T get_default_value() {
        return default(T);
    }
    
    public T[] create_array(int size) {
        var array = new T[size];
        for (int i = 0; i < size; i++) {
            array[i] = default(T);
        }
        return array;
    }
    
    public void reset_field(ref T field) {
        field = default(T);
    }
}

// Usage
var int_example = new DefaultExample<int>();
int default_int = int_example.get_default_value(); // 0

var string_example = new DefaultExample<string>();
string default_string = string_example.get_default_value(); // null
```

## Advanced Attribute Combinations

### **[Experimental]** with versioning
Marks experimental APIs with version tracking.

```java
public class ExperimentalAPI {
    [Version (experimental = true, since = "1.5")]
    [CCode (cname = "experimental_function")]
    public void experimental_feature() {
        print("This is an experimental feature\n");
    }
    
    [Experimental]
    [Version (since = "2.0")]
    public async void async_experimental() {
        yield experimental_async_operation();
    }
}
```

### **[ThreadSafe]** attribute
Marks classes or methods as thread-safe.

```java
[ThreadSafe]
public class ThreadSafeCounter {
    private int count = 0;
    private Mutex mutex = Mutex();
    
    [ThreadSafe]
    public void increment() {
        lock (mutex) {
            count++;
        }
    }
    
    [ThreadSafe]
    public int get_count() {
        lock (mutex) {
            return count;
        }
    }
}
```

## Complete Documentation Summary

### Final Resource Collection
- **[Complete Vala Reference](https://wiki.gnome.org/Projects/Vala)** - Official Vala project page
- **[Vala Language Manual](https://wiki.gnome.org/Projects/Vala/Manual)** - Complete language specification
- **[Vala API Documentation](https://valadoc.org/)** - Comprehensive API reference
- **[Vala Tutorial](https://wiki.gnome.org/Projects/Vala/Tutorial)** - Step-by-step learning guide
- **[Vala Examples Repository](https://gitlab.gnome.org/GNOME/vala/-/tree/main/tests)** - Official code examples
- **[GTK4 Vala Integration](https://docs.gtk.org/gtk4/)** - GTK4 development with Vala
- **[GObject Integration Guide](https://developer.gnome.org/gobject/stable/)** - GObject system integration
- **[Vala Memory Management](https://wiki.gnome.org/Projects/Vala/ReferenceHandling)** - Memory management details
- **[Vala Bindings Guide](https://wiki.gnome.org/Projects/Vala/Bindings)** - Creating library bindings
- **[Elementary OS Vala Guide](https://docs.elementary.io/develop/)** - Platform-specific development
