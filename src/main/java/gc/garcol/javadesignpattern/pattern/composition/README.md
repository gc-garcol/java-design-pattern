# Composition

## 1. Formula

### 1.1 Simple composition
```text
f: X → Y
g: Y → Z

=> h = g ∘ f: X → Z
```

### 1.2 Chaining of composition
```text
f_1: X_1 → X_2
f_2: X_2 → X_3
...
f_n: X_n → X_{n + 1}

=> f = f_1 ∘ f_2 ... f_n : X_1 → X_{n + 1}
```

## 2. Implementation for ETL
### 2.1 Requirement
- Input: IN
- Output: OUT
f: IN -> OUT
### 2.2 Transformers
- f_1: IN -> D_1
- f_2: D_1 -> D_2
- f_3: D_2 -> D_3
- ...
- f_n: D_n -> OUT

f = f_1 ∘ f_2 ... f_n : IN -> OUT
