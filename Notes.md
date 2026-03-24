# Hello World

My notes on networking and web basics, most are my own, some explanations taken from the internet, these are meant to be comprehensive and beginner-friendly and should be on Github.

---

# Sec-1: The Internet: Mechanics and Basics

## History

The Internet started off as the ARPANET in 1960s as a US Army funded Research Program. It was in the 1980s lobbied for by companies and organisations to be made a public technology and kicked off the DotCom Boom and Internet Revolution. Nevertheless, it's core goal hasn't changed much since ARPANET. Which is finding ways to keep a bunch of devices adequately connected and making sure they stay connected.

---

## Networks

Networks are basically connections of machines in this context. Let us start off with an elementary network of 2 computers. They can be connected in a **wired** manner with an Ethernet Cable or **Wireless** fashion with bluetooth or wifi. All modern computers support these technologies.

Let's see what happens when we make it more complex, for instance with 10 computers, we need 45 cables total and 9 switches per computer for the network. To manage complexity, we add into computers machines called Network Switches

### Network Switch

A computer with a Network Switch is basically at the receiving end of communications which all pass through the switch. The switch makes sure the data sent is only intended for it's particular computer and acts as a proxy. A single network switch makes sure all are computers can be managed with 10 cables and 10 plugs total. So it does a good job at distributing information by assigning identity to computers rather than cable-plug combinations for each computer.

### A Network of Networks

So far so good. But what about connecting hundreds, thousands, billions of computers? Of course a single switch can't scale that far, but, if you read carefully, we said that a switch is a computer like any other, so what keeps us from connecting two switches together? Nothing, so let's do that.

---

## Complexity in Networks

One may just think that we can continue connecting switches together and form a network of any large no. of computers. But in reality many engineering problems arise with that and it is not possible.

The more switches a packet has to go through, the longer it takes to reach its destination. And you can't have just a tree of switches, because then a single switch failure may disconnect a large portion of devices.

### Routers

Routers are Machines used to transmit information to and fro from networks. when a packet arrives, it reads the recipient address and forwards the packet to the right recipient directly, without going through layers of relays.

### Modems

The Telephone network was vast and advantageous and existed before the internet. So we used a device called a Modem to enable computer information to be transmitted via Telephone networks and vice versa.

> Note that the commercial router in your home is likely a combination of a switch, a router, and a modem, all in one device.

### ISPs

So we are connected to the telephone infrastructure. The next step is to send the messages from our network to the network we want to reach. To do that, we will connect our network to an Internet Service Provider (ISP). An ISP is a company that manages some special routers that are all linked together and can also access other ISPs' routers. So the message from our network is carried through the network of ISP networks to the destination network. The Internet consists of this whole infrastructure of networks.

---

## How we find Computers

There should be some sort of mechanism for finding particular computers to send information. These are IP Adresses and Domain Names.

### IP Address

An Internet Protocol Address is a particular Address of a series of 4 nos. seperated by a bunch of dots. It is used as a unique identifier for a computer. Since it is not very readable it can be replaced by a string called a domain name. 

For example (at the time of writing; IP addresses can change) ```google.com``` is the domain name used on top of the IP address ```142.250.190.78```

### Domain Name

[Read Here](https://developer.mozilla.org/en-US/docs/Learn_web_development/Howto/Web_mechanics/What_is_a_domain_name)

---

## More on the Internet

### Internet and the Web

> As you might notice, when we browse the Web with a Web browser, we usually use the domain name to reach a website. Does that mean the Internet and the Web are the same thing? It's not that simple. As we saw, the Internet is a technical infrastructure which allows billions of computers to be connected all together. Among those computers, some computers (called Web servers) can send messages intelligible to web browsers. The Internet is an infrastructure, whereas the Web is a service built on top of the infrastructure. It is worth noting there are several other services built on top of the Internet, such as email and IRC.

### Intranets and Extranets

> Intranets are private networks that are restricted to members of a particular organization. They are commonly used to provide a portal for members to securely access shared resources, collaborate and communicate. For example, an organization's intranet might host web pages for sharing department or team information, shared drives for managing key documents and files, portals for performing business administration tasks, and collaboration tools like wikis, discussion boards, and messaging systems.

Extranets are very similar to Intranets, except they open all or part of a private network to allow sharing and collaboration with other organizations. They are typically used to safely and securely share information with clients and stakeholders who work closely with a business. Often their functions are similar to those provided by an intranet: information and file sharing, collaboration tools, discussion boards, etc.

Both intranets and extranets run on the same kind of infrastructure as the Internet, and use the same protocols. They can therefore be accessed by authorized members from different physical locations.

### Hyperlinks

[Read Here](https://developer.mozilla.org/en-US/docs/Learn_web_development/Howto/Web_mechanics/What_are_hyperlinks)

### URLs

[Read Here](https://developer.mozilla.org/en-US/docs/Learn_web_development/Howto/Web_mechanics/What_is_a_URL)

---

# Sec-2: HTTP and Web Basics

## Protocol

A protocol is an algorithm defined for exchange of data between 2 or more computers. It is a fixed system with a set of instructions, protocols are central to the purpose of the internet as it was earlier intended and are widely used by the common people everyday.

---

## HTTP

HTTP is the **H**yper**T**ext **T**ransfer **P**rotocol.

### What it is

A widely used protocol in the internet suite(essential to maintaining the internet). Some stuff about it:

- It is a client-server protocol, meaning the user has to initiate it to the server.

- It uses methods called **Requests**(asking for data) and requests provide **Responses**(Getting data) when the connection is initiated.

- It requires a connection protocol to connect the computers in order for data transfer. Connection Protocols are Protocols for facilitating appropriate exchange of information by ensuring factors such as speed, reliable transmission and security for it.

- It is extensible andis therefore used for requesting many types of data like HTML Forms, images and audio files/

- Theoretically HTTP can use any protocol which provides a connection but for web purposed two are used:

#### TCP/IP

It stands from **T**ransfer **C**ontrol **P**rotocol. It was developed by DARPA scientists in the 1970s and is known for it's reliability and error-free transmission along with sending data streams in an exactly intended format by the user. It uses an AIMD Algorithmic method called Congestion Control to adequately handle bandwidth.

#### TCP/IP with TLS

It stands for **T**ransmission **L**ayer **S**ecurity. A Security protocol preventing tampering, access or  eavsdropping on data streams in transmission. It is used by messengers, email, protocols and web browsers. For instance on web browsers it used it's digital certificate to provide authentication to a server. Mutual Authentication by Certificates of both the server and client.

### Innards of the HTTP Protocol

Here we seek to answer how HTTP is made up and structured, why and how it was built.

HTTP is on the Application Layer of the web and therefore away from the network and cache layers and proxie between the request and the server with the info.

### The User-Agent

The User-Agent is what sends the request in HTTP and represents the user, it is usually the Browser or Debugger Programs. The Browser is the one that initiates requests to the server.

For instance, when fetching a webpage by an HTTP Request, the Browser first requests the HTTP Form, then reads script to determine which more resources to request like CSS, Images and other elements of a webpage, the server correspondingly sends the web page components in a data stream to render it locally client-side.

Hypertext can also be fetched, initiating a URL Fetch for a new webpage which upon clicking HTTP Requests a new webpage.

### The Server

A Server is a Proxy machine "Serving" Data to computers, it may not be a single machine and be multiple machines, or multiple servers on one machine. It is polymorphic and can be a DB, a cache or more. We will learn more about this in Sec-3.

### Caches

A cache (web cache or HTTP cache) is a component that stores HTTP responses temporarily so that it can be used for subsequent HTTP requests as long as it meets certain conditions.

### Proxies

There are many machines between the User-Agent and Server, those of these at the Application Layer are called proxies.
They can be transparent or non-transparent. Transparent proxies do not alter the data stream but Non-Transparent proxies do. Proxies may perform numerous functions:

- caching (the cache can be public or private, like the browser cache)

- filtering (like an antivirus scan or parental controls)

- load balancing (to allow multiple servers to serve different requests)

- authentication (to control access to different resources)

- logging (allowing the storage of historical information)

### Breakdown

- HTTP Code is simple and readable.

- HTTP is extensible and fit for experiments. An **HTTP Header** is something that enables servers to add extra info in the responses. This helps extensibility.

- HTTP is Stateless, but not sessionless. A lack of state means it has no single state and many requests can independently and concurrently happen. HTTP Cookies are used to store Stateful Information for Logging.

### The Scope and Control of HTTP

- **Caching**: HTTP Catches, how documents are cached can be controlled by HTTP. The server can instruct proxies and clients about what to cache and for how long. The client can instruct intermediate cache proxies to ignore the stored document.

- **Origin Constraint**: CORS is the origin constraint on the web. It enables websites to not be able to request data except from the server origin, so websites cannot request other data from other webpages which is a security constraint. *HTTP can relax this constraint by issuing elements from multiple origins in security or server bandwidth utilities.*

- **Authentication**: Some pages may be protected so that only specific users can access them. Basic authentication may be provided by HTTP, either using the WWW-Authenticate and similar headers, or by setting a specific session using HTTP cookies.

- **Proxy and tunneling**: Servers or clients are often located on intranets and hide their true IP address from other computers. HTTP requests then go through proxies to cross this network barrier. Not all proxies are HTTP proxies. The SOCKS protocol, for example, operates at a lower level. Other protocols, like FTP, can be handled by these proxies.

- **Sessions**: Using HTTP cookies allows you to link requests with the state of the server. This creates sessions, despite basic HTTP being a state-less protocol. This is useful not only for e-commerce shopping baskets, but also for any site allowing user configuration of the output.

### Using HTTP

Done in Tutorial.http, rather ingenious way to learn backends sending HTTP Requests to REST Client Extension.

---

## Web Stuff

### HTML Forms 

Web Forms are pages that your users request using their browser. These pages can be written using a combination of HTML, client-script, server controls, and server code. When users request a page, it is compiled and executed on the server by the framework, and then the framework generates the HTML markup that the browser can render. An ASP.NET Web Forms page presents information to the user in any browser or client device.

### APIs

APIs, or Application Programming Interfaces, are the invisible backbone of modern software development. They enable applications and systems to communicate and share data efficiently.

- Enable seamless interaction between applications, platforms, and services.

- Power everyday features such as weather updates, payments, and e-commerce checkouts.

This way how APIs work in software is that the API takes a request, sends it to the server, retrieves the data, and returns the response.

### Servers

### Domains

A domain is an authority within the internet that controls its own resources. Its "domain name" is a way to address this authority as part of the hierarchy in a URL - usually the most memorable part of it, for instance a brand name.

---

## More HTTP

Here we go over how HTTP interacts with backend and send our first requests.


### HTTP Flow

- User-Agent connects with TCP/TCP+TLS, multiple servers can be connected to, a newor existing connection can be used.

- Send HTTP Code for Request:

```
GET / HTTP/1.1
Host: developer.mozilla.org
Accept-Language: fr
```

- The Response Stream by the server is sent:

```
HTTP/1.1 200 OK
Date: Sat, 09 Oct 2010 14:28:02 GMT
Server: Apache
Last-Modified: Tue, 01 Dec 2009 20:18:22 GMT
ETag: "51142bc1-7449-479b075b2891b"
Accept-Ranges: bytes
Content-Length: 29769
Content-Type: text/html

<!doctype html>… (here come the 29769 bytes of the requested web page)
```

- Multiplexing requests, which initiate many requests before the first response can be used. This is hard to implement and till HTTP/2 was done by Pipelining.

### HTTP Syntax

- The message are readable and meant to be read. 

#### Request: Its elements in order

- HTTP Method: It is the operation, usually a verb, that the client wants to perform, when fetching data from the server-side this can be ```GET``` or when posting the value of an HTML Form it is ```POST```.

- It can optionally contain headers, defined above.

- The path where information is taken from or returned, excluding domain, or protocol since those are known.

- A body, for some methods like ```POST```, similar to those in responses, which contain the resource sent.

#### Response: Its elements in order

Responses consist of the following elements:

- The version of the HTTP protocol they follow.

- A status code, indicating if the request was successful or not, and why.

- A status message, a non-authoritative short description of the status code.

- HTTP headers, like those for requests.

- Optionally, a body containing the fetched resource.

### Endotes

HTTP is an extensible internet protocol essential for the web. It has a detailed structure and emphasises, ease-of-use, appropriate information handling and efficient Transmission. Many APIs are also based on HTTP.

---

## HTTP Methods

* HTTP methods (verbs) define **what action the client wants to perform**
* Each request includes:

  * Method (GET, POST, etc.)
  * URL (resource)
  * Optional body
* Methods describe **intent, not implementation**

### Core Concepts

* Method = **what you want to do**
* URL = **what you want to do it to**

Example:

* `GET /users` → get users
* `POST /users` → create user

### Safe Methods

* Do **not change server state**
* Used for reading only
* Examples:

  * GET
  * HEAD
  * OPTIONS
  * TRACE

### Idempotent Methods

* Repeating request → same result
* Examples:

  * GET
  * PUT
  * DELETE
  * HEAD

### Cacheable Methods

* Responses can be stored and reused
* Examples:

  * GET
  * HEAD

### GET

* Retrieves data
* No side effects
* No request body (usually)

Example:
GET /users

### HEAD

* Same as GET but:

  * No response body
* Used to check metadata

### POST

* Sends data to server
* Creates or modifies resources
* Has request body
* Not idempotent

Example:
POST /users

### PUT

* Replaces entire resource
* Idempotent

Example:
PUT /users/1

### DELETE

* Removes resource
* Idempotent

Example:
DELETE /users/1

### PATCH

* Partially updates resource
* Not always idempotent

Example:
PATCH /users/1

### OPTIONS

* Asks server what methods are allowed
* Used in CORS

### CONNECT

* Creates a network tunnel
* Used for HTTPS via proxy

### TRACE

* Returns request back
* Used for debugging
* Rarely used

### Mental Model

METHOD + URL = INTENTION

Examples:

* GET /balance → read data
* POST /deposit → change data
* DELETE /account → remove data

### Backend Mapping

* Each HTTP method maps to a function

GET → read
POST → create/change
PUT → replace
DELETE → remove

### One-line Summary

HTTP methods tell the server **what action to perform on a resource**

---

# Sec-3: Servers

## Servers

Servers are the machines or systems that **store, process and serve data** to other computers over a network. Earlier we defined them loosely as machines that serve data, but in reality they are much more structured and intentional in how they work.

At a fundamental level, a server exists to **listen for requests, process them and return responses**.

---

### What a Server Really Is

A server is not necessarily a powerful computer sitting somewhere special. It is better understood as:

* A **program** that listens for incoming requests
* Running on a **machine** which can be physical or virtual
* Designed to handle **multiple clients at once**

This distinction is important.

> One machine can run multiple servers, and one server can be distributed across many machines.

---

### Types of Servers

Servers are polymorphic. Their behavior depends entirely on what role they are designed to perform.

#### Web Server

A web server handles HTTP requests and serves static content like HTML, CSS, JavaScript and images. It is optimized for fast delivery rather than complex computation.

Example:

```
GET /index.html
→ returns HTML file
```

#### Application Server

An application server contains the **core logic** of a system. It processes requests, performs computations and interacts with other components like databases.

Example:

```
GET /user/1
→ fetch user from database
→ return JSON
```

#### Database Server

A database server stores and manages structured data. It does not usually deal with HTTP directly, instead it responds to query languages like SQL.

Example:

```
SELECT * FROM users WHERE id = 1;
```

#### Cache Server

A cache server stores frequently used data in memory. This reduces latency and avoids repeated expensive operations like database queries.

Example:

* Instead of querying the database every time, return a cached result

---

### How Servers Fit Together

In real systems, servers do not exist alone. They are arranged in layers.

A typical flow looks like this:

```
Client (Browser)
        ↓
Web Server
        ↓
Application Server
        ↓
Database Server
        ↓
Response back to client
```

Each layer has a specific responsibility. This separation makes systems easier to scale, debug and improve.

---

### Stateless and Stateful Servers

One of the most important ideas in server design is whether the server keeps track of state.

#### Stateless

Each request is independent. The server does not remember anything about previous requests.

Example:

* A basic HTTP request without cookies

#### Stateful

The server remembers information across requests, such as user sessions.

Example:

* A logged in user whose session is stored

Modern systems tend to prefer stateless design because it is easier to scale. State is usually pushed into databases or caches instead.

---

### Scaling Servers

As more users interact with a system, the server needs to handle more load.

#### Vertical Scaling

Increase the power of a single machine by adding more CPU or RAM.

#### Horizontal Scaling

Add more machines and distribute requests across them.

Horizontal scaling is generally preferred because it improves reliability and avoids single points of failure.

---

### Load Balancing

A load balancer distributes incoming requests across multiple servers.

```
        Client
          ↓
    Load Balancer
      ↓     ↓     ↓
   Server Server Server
```

This prevents overload on a single machine and increases availability.

---

### Where Servers Run

Servers can exist in different environments:

* Local machines for development
* Data centers with physical infrastructure
* Cloud platforms like AWS, GCP and Azure

Most modern systems rely on cloud infrastructure because it allows flexible scaling and global distribution.

---

### The Server Lifecycle

Almost every server follows a simple loop:

1. Start and listen on a port
2. Wait for a request
3. Parse the request
4. Process the logic
5. Send a response
6. Repeat

In pseudocode:

```
while(true) {
    request = listen();
    response = process(request);
    send(response);
}
```

---

### Key Properties of Good Servers

* **Reliability**
  The server should handle failures gracefully and stay available

* **Scalability**
  It should handle increasing load without breaking

* **Efficiency**
  It should use resources well and respond quickly

* **Security**
  It should protect data and prevent unauthorized access

---

### Mental Model

A clean way to think about servers:

> A server is a system that waits, thinks and responds.

It waits for a request, processes it using logic and data, and sends back a response. Everything else, whether it is databases, caches or load balancers, exists to make that loop faster, safer and more reliable.

---

This is where things start getting real. Up till now we were mostly observing how the web works. From here on, we start actually building and controlling servers ourselves. 

---

# Sec-4: Making the thing(Builder's Docs)

Check the docs file...

# Thanks, feel free to reach out at cowboyhehe1@gmail.com
