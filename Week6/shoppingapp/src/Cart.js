import React from 'react';

class Cart extends React.Component {
  render() {
    return (
      <div style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', borderRadius: '8px' }}>
        <h3>{this.props.itemname}</h3>
        <p>Price: ₹{this.props.price}</p>
      </div>
    );
  }
}

export default Cart;
