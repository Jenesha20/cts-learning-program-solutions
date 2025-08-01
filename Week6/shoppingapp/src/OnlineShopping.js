import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  render() {
    const items = [
      { itemname: 'Laptop', price: 45000 },
      { itemname: 'Smartphone', price: 25000 },
      { itemname: 'Headphones', price: 2000 },
      { itemname: 'Keyboard', price: 1500 },
      { itemname: 'Mouse', price: 800 }
    ];

    return (
      <div style={{ textAlign: 'center' }}>
        <h2>🛒 Welcome to Online Shopping 🛍️</h2>
        {items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
