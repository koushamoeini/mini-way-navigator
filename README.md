# Mini Way Navigator

A lightweight Java library providing core data structures and models for map-based applications. This framework offers a hierarchical structure for representing roads, paths, nodes, and their relationships in navigation systems.

## 📋 Overview

Mini Way Navigator is designed as a foundational framework for building map and navigation applications. It provides a clean, object-oriented approach to modeling geographic data with support for:

- Geographic nodes with coordinates and metadata
- Hierarchical road structure (Way → MiniWay → SuperMiniWay)
- Traffic level management
- One-way and two-way road support
- Deadend detection
- Geographic range modeling
- Relationship mapping between ways
- Flexible tagging system

## 🌟 Features

### Core Components

- **Node**: Represents geographic points with latitude, longitude, and custom tags
- **SuperMiniWay**: Individual path segments between nodes with traffic levels (1-5) and deadend detection
- **MiniWay**: Bidirectional path representation supporting one-way or two-way roads
- **Way**: Complete roads composed of multiple MiniWay segments with naming and identification
- **Tag**: Flexible key-value metadata system using HashMap for custom properties
- **Relation**: Manages connections and relationships between different ways
- **Range**: Geographic area definition containing nodes and ways

### Key Features

- 🗺️ **Hierarchical Structure**: Clean separation of concerns from individual nodes to complete road systems
- 🚦 **Traffic Management**: 5-level traffic intensity system
- ↔️ **Directional Control**: Support for one-way and two-way roads
- 🚧 **Deadend Detection**: Built-in deadend identification for path segments
- 🏷️ **Flexible Tagging**: Custom metadata through HashMap-based tagging
- 🔗 **Relationship Mapping**: Automatic detection of shared nodes between ways
- 📍 **Coordinate System**: Integer-based latitude/longitude for geographic positioning
- 🪶 **Lightweight**: Zero external dependencies, pure Java implementation

## 🚀 Installation

### Clone the Repository

```bash
git clone https://github.com/koushamoeini/mini-way-navigator.git
cd mini-way-navigator
```

### Add to Your Project

Simply copy the source files from the `src/` directory to your Java project, or compile and package as a JAR:

```bash
javac src/*.java
jar cvf mini-way-navigator.jar *.class
```

## 💻 Usage

### Creating Nodes

```java
// Create a tag with metadata
HashMap<String, String> metadata = new HashMap<>();
metadata.put("type", "intersection");
metadata.put("name", "Main Square");
Tag tag = new Tag(metadata);

// Create a node
Node node1 = new Node(35678, 51123, tag);
Node node2 = new Node(35680, 51125, tag);
```

### Creating a Path with Traffic

```java
// Create a list of nodes forming a path
List<Node> pathNodes = Arrays.asList(node1, intermediateNode, node2);

// Create a SuperMiniWay with traffic level
SuperMiniWay segment = new SuperMiniWay(
    pathNodes,
    node1,              // First node
    node2,              // Last node
    SuperMiniWay.Traffic.three,  // Traffic level (1-5)
    false               // Is not a deadend
);

// Check traffic level
if (segment.getTraffic() == SuperMiniWay.Traffic.five) {
    System.out.println("Heavy traffic!");
}
```

### Creating One-Way or Two-Way Roads

```java
// Create reverse direction
SuperMiniWay reverseSegment = new SuperMiniWay(
    reversedNodes,
    node2,
    node1,
    SuperMiniWay.Traffic.two,
    false
);

// Create a two-way road
MiniWay twoWayRoad = new MiniWay(false, segment, reverseSegment);

// Create a one-way road
MiniWay oneWayRoad = new MiniWay(true, segment, null);
```

### Creating Complete Ways

```java
// Create tags for the way
HashMap<String, String> wayMetadata = new HashMap<>();
wayMetadata.put("highway", "primary");
wayMetadata.put("surface", "asphalt");
Tag wayTag = new Tag(wayMetadata);

// Create a complete way (road)
List<MiniWay> segments = Arrays.asList(miniWay1, miniWay2, miniWay3);
Way mainStreet = new Way("Main Street", segments, wayTag);
```

### Working with Relations

```java
// Create a relation to find connected ways
List<Tag> relationTags = new ArrayList<>();
relationTags.add(tag1);
relationTags.add(tag2);

Relation relation = new Relation(relationTags, mainStreet);
List<Way> connectedWays = relation.getwRelation();
```

### Defining Geographic Ranges

```java
// Define a geographic area
List<Node> areaNodes = Arrays.asList(node1, node2, node3);
List<SuperMiniWay> areaWays = Arrays.asList(segment1, segment2);

Range district = new Range("Downtown District", areaNodes, areaWays);
```

## 🏗️ Architecture

The library follows a hierarchical structure from smallest to largest components:

```
Node (Point)
    ↓
SuperMiniWay (Directional segment between nodes)
    ↓
MiniWay (Bidirectional road segment)
    ↓
Way (Complete named road)
    ↓
Relation (Connected road network)
    ↓
Range (Geographic area)
```

### Class Hierarchy

- **Node**: Geographic point with coordinates and tags
- **Tag**: Key-value metadata store
- **SuperMiniWay**: Unidirectional path segment with traffic info
- **MiniWay**: Bidirectional road segment (one-way or two-way)
- **Way**: Named road composed of multiple segments
- **Relation**: Network of connected ways
- **Range**: Geographic boundary containing nodes and ways

## 🛠️ Technologies

- **Language**: Java
- **Dependencies**: None (pure Java implementation)
- **Design Pattern**: Object-oriented with hierarchical composition
- **Data Structures**: ArrayList, HashMap

## 📦 Project Structure

```
mini-way-navigator/
├── src/
│   ├── Node.java           # Geographic point representation
│   ├── Tag.java            # Metadata tagging system
│   ├── SuperMiniWay.java   # Path segment with traffic
│   ├── MiniWay.java        # Bidirectional road segment
│   ├── Way.java            # Complete road representation
│   ├── Relation.java       # Way relationship mapping
│   └── Range.java          # Geographic area definition
├── .gitignore
├── LICENSE
└── README.md
```

## 🎯 Use Cases

This library is ideal for:

- Building custom map applications
- Navigation system prototypes
- Geographic information systems (GIS)
- Traffic simulation frameworks
- Route planning algorithms
- OpenStreetMap-like data structures
- Urban planning tools
- Delivery routing systems

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Kousha Moeini**

- GitHub: [@koushamoeini](https://github.com/koushamoeini)

## 🙏 Acknowledgments

- Inspired by OpenStreetMap data structures
- Designed for educational and practical use in map-based applications

---

⭐ If you find this library useful, please consider giving it a star on GitHub!

