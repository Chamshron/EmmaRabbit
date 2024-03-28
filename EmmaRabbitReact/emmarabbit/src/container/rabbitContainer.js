"use client";
import React, {useEffect, useState} from "react";
import Rabbit from "@/components/Rabbit";

const RabbitContainer = () => {
    const [rabbits, setRabbits] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/rabbits")
        .then(res=>res.json())
        .then(data=>setRabbits(data))
    },[])

    return(
        <section className=" scroll-mt-12 mb-28">
                {/* <ul className="">
                    {rabbits.map((rabbit, index) => (
                        <li 
                        key={index}
                        className=""
                        >
                         {rabbit.name}   
                        </li>
                    ))}
                </ul> */}
                <div>
                    {rabbits.map((rabbit,index) => (
                        <React.Fragment key={index}>
                            <Rabbit rabbit={rabbit}/>
                        </React.Fragment>
                    ))}
                </div>
        </section>
    )
}
export default RabbitContainer;