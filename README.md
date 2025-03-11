# Python Codes

# Python Libraries: NumPy, pandas, and Matplotlib

## 1. NumPy
**NumPy (Numerical Python)** is a powerful library for numerical computing in Python. It provides support for multi-dimensional arrays and matrices, along with a collection of mathematical functions to operate on these data structures.

### Key Features:
- Efficient handling of large datasets with its powerful n-dimensional array object (`ndarray`).
- Mathematical functions for complex operations such as linear algebra, Fourier transform, and random number generation.
- Highly optimized C code ensures fast computation.

### Example Usage:
```python
import numpy as np

# Creating a NumPy array
arr = np.array([1, 2, 3, 4, 5])
print("Array:", arr)

# Performing basic operations
print("Mean:", np.mean(arr))
print("Sum:", np.sum(arr))
```

---

## 2. pandas
**pandas** is a powerful data manipulation and analysis library built on top of NumPy. It is especially useful for handling structured data (e.g., spreadsheets, CSV files, etc.).

### Key Features:
- Provides two primary data structures: `Series` (1D data) and `DataFrame` (2D data).
- Supports data cleaning, transformation, and analysis.
- Offers extensive file input/output tools (CSV, Excel, SQL, etc.).

### Example Usage:
```python
import pandas as pd

# Creating a DataFrame
data = {'Name': ['Alice', 'Bob', 'Charlie'], 'Age': [25, 30, 35]}
df = pd.DataFrame(data)
print("DataFrame:\n", df)

# Accessing specific columns
print("Names:\n", df['Name'])

# Filtering data
print("Filtered Data:\n", df[df['Age'] > 28])
```

---

## 3. Matplotlib
**Matplotlib** is a powerful plotting library for Python. It enables visualization of data through various chart types such as line plots, bar graphs, scatter plots, etc.

### Key Features:
- Offers flexibility in plot customization.
- Supports interactive and static visualizations.
- Integrates seamlessly with other libraries like NumPy and pandas.

### Example Usage:
```python
import matplotlib.pyplot as plt
import numpy as np

# Generating sample data
x = np.linspace(0, 10, 100)
y = np.sin(x)

# Creating a plot
plt.plot(x, y, label='Sine Wave')
plt.title("Sine Wave Visualization")
plt.xlabel("X-axis")
plt.ylabel("Y-axis")
plt.legend()
plt.show()
```

---

## Summary
| Library    | Primary Use                | Key Feature             |
|-------------|---------------------------|-------------------------|
| **NumPy**     | Numerical computations     | Efficient array handling |
| **pandas**    | Data manipulation & analysis| Tabular data management |
| **Matplotlib**| Data visualization         | Flexible plotting tools |

These libraries are essential for data science, machine learning, and scientific computing in Python. Mastering them can greatly enhance your ability to analyze and visualize data effectively.

