
# KotlinPlayground

**KotlinPlayground** is a personal learning project and sandbox to explore and practice the Kotlin programming language. The repository contains various simple Kotlin scripts and examples demonstrating language features, idioms, and best practices.

---

## Project Structure

```
KotlinPlayground
│
├── LICENSE                         # Project license
├── KotlinPlaygroun.iml             # IntelliJ IDEA module configuration
│
└── src
    └── Main.kt                     # Primary example script demonstrating basic Kotlin features
```

---

## Example Overview (`Main.kt`)

This primary example script (`Main.kt`) covers basic Kotlin syntax and functionality, including:

- Function definitions and returns (regular and expression body syntax)
- Conditional logic (`if`, `else if`, `else`, ternary-like expressions)
- Loops (`for` loop with ranges)
- String manipulation and interpolation
- Numeric literals, arithmetic operations, and type inference

**Sample functions demonstrated:**

- `multiplyByTwo(x: Int): Int`
- `multiplyByThree(x: Int): Int`
- `multiplyByFour(x: Int)`
- `trueOrFalse(exp: Boolean): String`
- `oneOrTheOther(exp: Boolean): String`

The script contains numerous comments with IDE usage tips (IntelliJ IDEA) to enhance the learning experience.

---

## How to Run

### Using IntelliJ IDEA:

1. Open the project in IntelliJ IDEA by selecting the `KotlinPlaygroun.iml` file.
2. Navigate to `src/Main.kt`.
3. Click on the run icon or press the run shortcut.

### From Command Line:

Compile and run using Kotlin compiler:

```bash
kotlinc src/Main.kt -include-runtime -d KotlinPlayground.jar
java -jar KotlinPlayground.jar
```

---

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
