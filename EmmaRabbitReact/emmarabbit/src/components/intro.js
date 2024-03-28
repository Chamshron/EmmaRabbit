"use client";
import React from 'react';
import {motion} from "framer-motion";

export default function Intro() {
  return (
    <section className=' mb-28 max-w-[50rem] text-center scroll-mt-[100rem] sm:mb-0 relative'>
        <span className=' flex items-center justify-center font-bold'>
                <motion.div 
                initial={{ y: -100, opacity: 0}}
                animate={{ y: 0, opacity: 1}}
                className=' mt-12 relative h-3/4 flex items-center justify-center'>
                    Welcome to my Current Obession
                    </motion.div>
        </span>
    </section>
  )
}
