// src/Posts.js

import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();
      const posts = data.map(
        (item) => new Post(item.userId, item.id, item.title, item.body)
      );
      this.setState({ posts });
    } catch (error) {
      throw new Error('Failed to fetch posts');
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.message);
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>Blog Posts</h2>
        {this.state.posts.map((post) => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
