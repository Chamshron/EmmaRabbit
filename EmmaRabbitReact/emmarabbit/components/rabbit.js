import React, { Fragment } from 'react';

export default function Rabbit({rabbit}) {
    if (!rabbit){
        return "Loading..."
    }
    
  return (
    <div>
        <Fragment>
            <p>{rabbit.name}</p>
        </Fragment>
    </div>
  )
}
