<!-- README.md -->

# Spring Java Project with FakeStoreAPI Integration

<p>This repository contains a Spring Java project that demonstrates how to interact with the <a href="https://fakestoreapi.com/">FakeStoreAPI</a> for managing products. The project includes various API endpoints and exception handling.</p>

<h3>API Endpoints</h3>

<ul>
  <li><strong>Create Product</strong>: Endpoint to create a new product.</li>
  <li><strong>Update Product</strong>: Endpoint to update an existing product.</li>
  <li><strong>Get Single Product</strong>: Endpoint to retrieve details of a single product.</li>
  <li><strong>Get Product By Category</strong>: Endpoint to fetch products based on a specified category.</li>
  <li><strong>Get All Products</strong>: Endpoint to fetch all products available.</li>
  <li><strong>Delete Product</strong>: Endpoint to delete a product.</li>
  <li><strong>Get All Categories</strong>: Endpoint to fetch all available categories of products.</li>
</ul>

<h3>Exception Handling</h3>

<p>The project includes a global exception handler (<code>@ControllerAdvice</code>) to manage exceptions across all controllers and provide consistent error responses.</p>

<h3>Technologies Used</h3>

<ul>
  <li><strong>Spring Framework</strong>: Utilized for building robust and scalable Java applications.</li>
  <li><strong>RestTemplate</strong>: Used for making HTTP requests to interact with the FakeStoreAPI.</li>
  <li><strong>Maven</strong>: Dependency management and build automation tool.</li>
  <li><strong>JUnit</strong>: Used for unit testing the application components.</li>
</ul>

<h3>Usage</h3>

<p>To run the project locally:</p>

<ol>
  <li>Clone this repository.</li>
  <li>Configure your IDE (like IntelliJ IDEA or Eclipse) with Maven support.</li>
  <li>Update the necessary configurations (API endpoints, etc.) in the application properties or configuration files.</li>
  <li>Run the application as a Spring Boot application.</li>
</ol>

<h3>Contributions</h3>

<p>Contributions are welcome! If you have suggestions or improvements, feel free to fork the repository and submit a pull request.</p>

<h3>License</h3>

<p>This project is licensed under freeware. You are free to use, modify, and distribute the software with no additional restrictions.</p>
