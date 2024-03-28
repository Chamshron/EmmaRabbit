import React, { Fragment } from 'react';

export default function Rabbit({rabbits}) {
    if (!rabbits){
      console.log("Loading")  
      return "Loading..."
    }
    
  return (
    <div>
        <ul>
          {rabbits.map((rabbit, index) => (
            <li key={index}
            >
              {rabbit.name}
            </li>
          ))}
        </ul>
    </div>
  )
}
